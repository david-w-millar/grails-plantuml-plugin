includeTargets << grailsScript("_GrailsInit")
includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")



target(showBindings: "show grails script bindings"){
  binding.variables.each { k,v ->
   println k + "\t" + v
  }
}


setDefaultTarget(showBindings)

