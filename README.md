grails-plantuml-plugin
======================

PlantUML grails plugin to generate UML diagrams from sources.
Intended to be useful for generating images for use within grails
project documentation (gdocs).

The plugin provides three things:
* A script to generate diagrams from PlantUML (*generate-plantuml-diagrams*) (_This kind of works now_)
* A build event hook that generates diagrams and places them in the *grails.doc.images* directory for use in project documentation if it is specified (_This is coming soon..._)
* A means to embed PlantUml markup directly in grails project documentation (_This is also coming soon..._)

