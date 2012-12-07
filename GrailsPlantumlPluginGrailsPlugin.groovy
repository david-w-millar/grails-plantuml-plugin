class GrailsPlantumlPluginGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.3.7 > *"
    def title = "Grails Plantuml Plugin"
    def author = "David W Millar"
    def authorEmail = "david.w.millar@gmail.com"
    def license = "APACHE" // v2
    def description = '''\
Grails plugin to help out with PlantUML diagram generation from source files.
It is also intended to be easy to use to generate diagrams for your grails project documentation.
'''
    // Maybe one day, this won't be a lie
    def documentation = "http://grails.org/plugin/grails-plantuml-plugin"
    def scm = [ url: "https://github.com/david-w-millar/grails-plantuml-plugin" ]
//    def dependsOn = [:]

    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]


    // Your name could be here!
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]



    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
