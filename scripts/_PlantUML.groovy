/**
 * PlantUML related tasks
 */
import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')
includeTargets << grailsScript('_GrailsEvents')

final def START_EVENT_NAME = 'PumlStart'
final def END_EVENT_NAME = 'PumlEnd'


// TODO: add these as configuration parameters in Config.groovy

// Default Config
def plantUmlConfig = [
        format: 'png',
        verbose: 'true',
        config: '',
        output: "${basedir}/src/docs/images"
        // dir: "${basedir}/src/docs/puml"
]

// Define the PlantUmlTask
ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)

target(createPumlDiagrams: "Search project for plant uml diagram descriptions and generate diagrams"){
  event(START_EVENT_NAME, [])
  ant.plantuml(plantUmlConfig){
    fileset(dir: "${basedir}/src/docs/puml")
  }
  event(END_EVENT_NAME, [])
}

target(cleanPumlDiagrams: "Clean up intermediate puml diagrams"){
  ant.delete(dir: plantUmlConfig.output)
}


