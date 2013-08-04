includeTargets << grailsScript("_GrailsInit")
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")

setDefaultTarget(createSequenceDiagram)
