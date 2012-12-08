grails-plantuml-plugin
======================

PlantUML grails plugin to generate UML diagrams from sources.
Intended to be useful for generating images for use within grails
project documentation (gdocs).

This project is in it's infancy, and essentially does nothing at this
point, but there is active development to achieve 3 goals:

The plugin is intended to provide three things:
* A script to generate diagrams from PlantUML ( **generate-plantuml-diagrams** ) ( __This kind of works now__ )
* A build event hook that generates diagrams and places them in the **grails.doc.images** directory for use in project documentation if it is specified ( __This is coming soon...__ )
* A means to embed PlantUml markup directly in grails project documentation ( __This is also coming soon...__ )

