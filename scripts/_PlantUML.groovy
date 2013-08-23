/**
 * PlantUML related tasks
 */

import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')
includeTargets << grailsScript('_GrailsEvents')

final def START_EVENT_NAME = 'PumlGenerationStart'
final def END_EVENT_NAME = 'PumlGenerationEnd'


// ----- [ Config ] -----
// TODO: pull in this config info from Config.groovy with sensible defaults
// Default Configs
def diagramSources = [
  "${basedir}/src",
  "${basedir}/grails-app"
]

def plantUmlConfig = [
  format: 'png',
  verbose: 'true',
  config: '',
  output: "${basedir}/target/diagrams"
]


// PlantUml Task
ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)


// ----- [ Create / Clean  up diagrams ] -----
target(generatePumlDiagrams: "Generate Diagrams from plantuml files"){
  event(START_EVENT_NAME, [])

  showStatus("Starting PlantUML Diagram generation with config:")
  def fstring = "\t%-15s%-20s"
  plantUmlConfig.each { k, v ->
    def msg = sprintf(fstring, [k,v])
    showStatus msg
  }
  showStatus(sprintf(fstring, ['source dirs', diagramSources.join(', ')] ))

  ant.plantuml(plantUmlConfig){
    diagramSources.each { String dir ->
      fileset(dir: dir) { include(name: '**/*') }
    }
  }
  showStatus("Done PlantUML Diagram generation.")
  event(END_EVENT_NAME, [])
}


target(cleanPumlDiagrams: "Clean up intermediate puml diagrams"){
  showStatus("Cleaning PlantUML diagrams...")
  ant.delete(dir: plantUmlConfig.output)
  showStatus("Done.")
}



// ----- [ Create Diagrams ] -----

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

// ----- [ Helpers ] -----

def showStatus( String status, Boolean update = false) {
  def msg = "[plantuml-plugin] ${status}"
  update ?
    grailsConsole.updateStatus(msg) :
    grailsConsole.addStatus(msg)
}



