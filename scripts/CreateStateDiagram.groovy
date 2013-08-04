includeTargets << grailsScript("_GrailsInit")
includeTargets << new File("$plantumlPluginDir/scripts/_PlantUML.groovy")

setDefaultTarget(createStateDiagram)
