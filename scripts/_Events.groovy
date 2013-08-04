/**
 * Build event hooks for PumlDiagram generation
 */

includeTargets << grailsScript('_GrailsPackage')
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")

final def DOC_TYPE = 'refdocs'

// Generate diagrams for inclusion in docs
eventDocStart = { type ->
    if(type != DOC_TYPE)
        return
    ant.sequential {
        createPumlDiagrams()
    }
}

eventDocEnd = { kind ->
    if(type != DOC_TYPE)
        return
    ant.sequential {
      cleanPumlDiagrams()
    }
}
