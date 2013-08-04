class GrailsPlantumlPluginGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.3.7 > *"
    def title = "Grails Plantuml Plugin"
    def description = '''\
      Grails plugin to generate PlantUML diagrams from source.
      Hooks into build events so that these diagrams can be used in project documentation.
      Provides support for embedding PlantUML diagrams in project documentation.
      '''

    def author = "David W Millar"
    def authorEmail = "david.w.millar@gmail.com"
    // Maybe one day, this won't be a lie
//    def documentation = "http://grails.org/plugin/grails-plantuml-plugin"
    def scm = [ url: "https://github.com/david-w-millar/grails-plantuml-plugin" ]
    def license = "APACHE" // v2

    def pluginExcludes = [ "grails-app/views/error.gsp" ]
    def scopes = [excludes: ['test', 'run', 'war']]
//    def artefacts = [ com.millarts.grails.PumlDiagramHandler ]

    // Your name could be here!
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    def doWithWebDescriptor = { xml -> }
    def doWithSpring = { }
    def doWithDynamicMethods = { ctx -> }
    def doWithApplicationContext = { applicationContext -> }
    def onChange = { event -> }
    def onConfigChange = { event -> }

}
