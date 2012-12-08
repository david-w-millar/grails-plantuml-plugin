/**
 * Generates plant uml diagrams from plantuml files located in "src/docs/uml/*".
 *
 */
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")
setDefaultTarget("createPumlDiagrams")

binding.variables.each { println it.dump() }
