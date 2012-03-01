griffon.project.dependency.resolution = {
    inherits("global") 
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
        // pluginDirPath is only available when installed
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "ratpackLibDir", dirs: ["${basePath}lib"]
    }
    dependencies {
        runtime 'com.bleedingwolf.ratpack:ratpack:0.2-griffon',
                'javax.servlet:servlet-api:2.5',
                'org.json:json:20090211'
        runtime('org.mortbay.jetty:jetty:6.1.26') { excludes 'slf4j-api', 'servlet-api' }
        runtime('org.mortbay.jetty:jetty-util:6.1.26') { excludes 'slf4j-api', 'servlet-api' }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}