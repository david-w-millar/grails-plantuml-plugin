/**
 * Build event hooks for PumlDiagram generation
 */

includeTargets << grailsScript('_GrailsPackage')
includeTargets << new File("$plantumlPluginDir/scripts/_PlantUML.groovy")

final String DOC_TYPE = 'refdocs'

// Generate diagrams for inclusion in docs
eventDocStart = { type ->
    if(type == DOC_TYPE)
      ant.sequential.createPumlDiagrams()
}

eventDocEnd = { kind ->
    if(type == DOC_TYPE)
      ant.cleanPumlDiagrams()
}
