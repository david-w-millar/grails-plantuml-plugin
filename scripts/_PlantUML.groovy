/**
 * PlantUML related tasks
 */

import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')
includeTargets << grailsScript('_GrailsEvents')
includeTargets << grailsScript('_GrailsCreateArtifacts')

final def START_EVENT_NAME = 'PumlStart'
final def END_EVENT_NAME = 'PumlEnd'

final def DIAGRAM_SOURCE = "${basedir}/grails-app/diagrams"


// TODO: add these as configuration parameters in Config.groovy
// Default Config
def plantUmlConfig = [
  format: 'png',
  verbose: 'true',
  config: '',
  output: "${basedir}/target/diagrams"
]

// PlantUml Task
ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)

target(createPumlDiagrams: "Generate Diagrams from plantuml files"){
  event(START_EVENT_NAME, [])
  ant.plantuml(plantUmlConfig){
    fileset(dir: DIAGRAM_SOURCE)
  }
  event(END_EVENT_NAME, [])
}

target(cleanPumlDiagrams: "Clean up intermediate puml diagrams"){
  ant.delete(dir: plantUmlConfig.output)
}


// -----[ Create Diagram Targets ]-----

target(createActivityDiagram: "Create an activity diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating activity diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createClassDiagram: "Create a class diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating class diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createComponentDiagram: "Create an component diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating component diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createObjectDiagram: "Create an object diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating object diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createSequenceDiagram: "Create a sequence diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating sequence diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createStateDiagram: "Create a state diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating state diagram ${name} in ${DIAGRAM_SOURCE}")
}

target(createUseCaseDiagram: "Create a use case diagram") {
  depends(parseArguments)
  def name = argsMap.params[0] + ".puml"
  grailsConsole.updateStatus("Creating use case diagram ${name} in ${DIAGRAM_SOURCE}")
}
