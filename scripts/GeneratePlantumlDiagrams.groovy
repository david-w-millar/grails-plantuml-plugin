/**
 * Generates plant uml diagrams from plantuml files
 *
 */
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")
setDefaultTarget("plantuml")

