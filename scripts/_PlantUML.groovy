/**
 * PlantUML related tasks
 */
import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')
includeTargets << grailsScript('_GrailsEvents')

final def START_EVENT_NAME = 'PumlStart'
final def END_EVENT_NAME = 'PumlEnd'

// Default Config
def plantUmlConfig = [
        format: 'png',
        verbose: 'true',
        config: '',
        output: "${basedir}/src/docs/images", // TODO: get grails.doc.images property
        dir: "${basedir}/src/docs/puml"
]

// Define the PlantUmlTask
ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)

target(createPumlDiagrams: "Search project for plant uml diagram descriptions and generate diagrams"){
  println "::::: You've configured this: " + config.grails.doc.images
  event(START_EVENT_NAME, [])
  plantuml(plantUmlConfig)
  event(END_EVENT_NAME, [])
}


