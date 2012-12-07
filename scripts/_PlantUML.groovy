/**
 * PlantUML related tasks
 */
import net.sourceforge.plantuml.ant.PlantUmlTask

includeTargets << grailsScript('_GrailsClasspath')

// Default Config
// TODO: Pull these from CommandLineParser or BuildConfig
def config = [
        format: 'png',
        verbose: 'true',
        config: '',
        output: "${basedir}/src/docs/images",
        dir: "${basedir}/src/docs/puml"
]

ant.taskdef(name: 'plantuml', classname: 'net.sourceforge.plantuml.ant.PlantUmlTask', classpath: testClasspath)

target(createPumlDiagrams: "Search project for plant uml diagram descriptions and generate diagrams"){
    plantuml(config)
}

