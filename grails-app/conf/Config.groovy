// CORS (Cross-Origin Resource Sharing) yapılandırması
cors {
    enabled = true
    allowOrigin = "*"
    allowMethods = "GET, POST, PUT, DELETE, OPTIONS" 
    allowHeaders = "*"
    allowCredentials = true
    maxAge = 3600
}

grails.converters.encoding = "UTF-8"
grails.views.default.codec = "html"
grails.controllers.defaultScope = 'singleton'

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
    }
}

log4j = {
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%c{2} %m%n')
        file name: 'file', file: 'app.log', layout: pattern(conversionPattern: '%c{2} %m%n')
    }

    root {
        info 'stdout', 'file'
        additivity = true
    }

    debug 'com.mylibrary.package'
}
