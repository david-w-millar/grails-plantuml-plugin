/**
 * PlantUML related tasks
 */
import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')

// Default Config
def plantUmlConfig = [
        format: 'png',
        verbose: 'true',
        config: '',
        output: "${basedir}/src/docs/images", // TODO: get grails.doc.images property
        dir: "${basedir}/src/docs/puml"
]

ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)

target(createPumlDiagrams: "Search project for plant uml diagram descriptions and generate diagrams"){
  println "::::: You've configured this: " + config.grails.doc.images
  plantuml(plantUmlConfig)
}


