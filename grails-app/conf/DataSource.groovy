dataSource {
    pooled = true
    jmxExport = true
    configClass = org.grails.plugin.hibernate.filter.HibernateFilterDomainConfiguration
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
    singleSession = true
    flush.mode = 'manual'
}

environments {

    development {
        dataSource {
            dbCreate = "update"
            username = "sa"
            password = "sa123"

            url = "jdbc:sqlserver://localhost:1433;databaseName=Library"
            driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        }

        hibernate {
            cache.use_second_level_cache = true
            cache.use_query_cache = false
            cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
            singleSession = true
            flush.mode = 'manual'
        }

    }


}