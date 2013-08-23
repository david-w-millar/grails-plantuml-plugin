grails.project.class.dir        = 'target/classes'
grails.project.test.class.dir   = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'

grails.work.dir = 'target'

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        build 'net.sourceforge.plantuml:plantuml:7943'
        build 'org.grails:doc-engine:1.0.1'
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.0.3",
              ":rest-client-builder:1.0.2") {
            export = false
        }
    }
}
