/**
 * Handles PlantUML diagram generation in response to events
 */

includeTargets << grailsScript('_GrailsPackage')
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")


// Generate diagrams for inclusion in docs
eventDocStart = { kind ->
  if(kind != 'refdocs')
    return
  ant.sequential {
    createPumlDiagrams()
  }
}

