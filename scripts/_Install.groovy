/**
 * This script is executed by Grails after plugin was installed to project.
 * Creates a directory for puml diagrams.
 */

includeTargets << new File("${basedir}/scripts/_PlantUML.groovy")

ant.mkdir(dir: DIAGRAM_SOURCE)
