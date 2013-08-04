/**
 * Generates plant uml diagrams from plantuml files
 *
 */
includeTargets << new File("$plantumlPluginDir/scripts/_PlantUML.groovy")
setDefaultTarget(generatePumlDiagrams)


