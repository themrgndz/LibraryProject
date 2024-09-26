dataSource {
    pooled = true
    jmxExport = true
    //generateSimpleParameterMetadata = true
    configClass = org.grails.plugin.hibernate.filter.HibernateFilterDomainConfiguration
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

environments {

    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''		generateSimpleParameterMetadata = true

            username = "sa"
            password = "sa123"


            url = "jdbc:jtds:sqlserver://localhost:1433/UzmLibrary"  //mssql
            driverClassName = "net.sourceforge.jtds.jdbc.Driver" // mssql
            properties {
                jmxEnabled = true
                initialSize = 5
                maxActive = 50
                minIdle = 5
                maxIdle = 25
                maxWait = 10000
                maxAge = 10 * 60000
                timeBetweenEvictionRunsMillis = 5000
                minEvictableIdleTimeMillis = 60000
                validationQuery = "SELECT 1"
                validationQueryTimeout = 3
                validationInterval = 15000
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = false
                jdbcInterceptors = "ConnectionState;StatementCache(max=200)"
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }

        }

        hibernate {
            cache.use_second_level_cache = true
            cache.use_query_cache = false
            cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
            singleSession = true // configure OSIV singleSession mode
            flush.mode = 'manual' // OSIV session flush mode outside of transactional context
        }

    }


}