/**
 * Handles PlantUML diagram generation in response to events
 */

includeTargets << grailsScript('_GrailsPackage')
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")

final def DOC_TYPE = 'refdocs'

// Generate diagrams for inclusion in docs
eventDocStart = { kind ->
    if(kind != DOC_TYPE)
        return
    ant.sequential {
        createPumlDiagrams()
    }
}

eventDocEnd = { kind ->
    if(kind != DOC_TYPE)
        return
    ant.sequential {
      cleanPumlDiagrams()
    }
}
