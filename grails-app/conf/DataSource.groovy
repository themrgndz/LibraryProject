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
    singleSession = true
    flush.mode = 'manual'
}

environments {

    development {
        dataSource {
            dbCreate = "update"
            username = "sa"
            password = "sa123"

            url = "jdbc:jtds:sqlserver://localhost:1433/Library"
            driverClassName = "net.sourceforge.jtds.jdbc.Driver"
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