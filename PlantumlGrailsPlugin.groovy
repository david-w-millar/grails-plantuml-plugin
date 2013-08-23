class PlantumlPluginGrailsPlugin {
  def version = '0.2.0-SNAPSHOT'
  def grailsVersion = '2.0.0 > *'
  def group = 'com.millarts'

  def title = "Grails Plantuml Plugin"
  def description = '''\
    Grails plugin to generate PlantUML diagrams from source.
    Hooks into build events so that these diagrams can be used in project documentation.
    '''

  def author = "David W Millar"
  def authorEmail = "david.w.millar@gmail.com"

  def documentation = "http://grails.org/plugin/grails-plantuml-plugin"
  def scm = [ url: "https://github.com/david-w-millar/grails-plantuml-plugin" ]
  def license = "APACHE" // v2

  def pluginExcludes = [
    'src/groovy/**/*',
    'grails-app/controllers/**/*',
    'grails-app/domain/**/*',
    'grails-app/i18n/**/*',
    'grails-app/services/**/*',
    'grails-app/taglib/**/*',
    'grails-app/utils/**/*',
    'grails-app/views/**/*'
  ]

  def scopes = [ excludes: ['test', 'run', 'war'] ]

  // Your name could be here!
  //def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

  // Nothing yet
  def doWithWebDescriptor = { xml -> }
  def doWithSpring = { }
  def doWithDynamicMethods = { ctx -> }
  def doWithApplicationContext = { applicationContext -> }
  def onChange = { event -> }
  def onConfigChange = { event -> }

}
