/**
 * Generates plant uml diagrams from plantuml files located in "src/docs/uml/*".
 *
 */
includeTargets << new File('scripts/_PlantUML.groovy')

setDefaultTarget("createPumlDiagrams")


