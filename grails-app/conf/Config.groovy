grails.plugin.springsecurity.cors.allowedOrigins = ['http://localhost:3030']

// CORS (Cross-Origin Resource Sharing) yapılandırması
cors.enabled = true
cors.mappings = [
        '/**': [
                allowedOrigins: ['*'], // React uygulamanızın çalıştığı port
                allowedMethods: ['GET', 'POST', 'PUT', 'DELETE'],
                allowedHeaders: ['*'],
                exposedHeaders: ['Content-Disposition'],
                allowCredentials: true,
        ]
]

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.exceptionresolver.params.exclude = ['password']
// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}

grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

cors {
    enabled = true
    allowOrigin = "*"
    allowMethods = "GET, POST, PUT, DELETE, OPTIONS"
    allowHeaders = "*"
    allowCredentials = true
    maxAge = 3600
}

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
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

    debug 'com.mylibrary.package' // Hangi paketlerin loglanacağını belirleyin
}
// log4j configuration
log4j.main = {

    error  'org.codehaus.groovy.grails.web.xml.servlet',        // controllers
           'org.codehaus.groovy.grails.web.xml.pages',          // GSP
           'org.codehaus.groovy.grails.web.xml.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.xml.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.xml.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}
