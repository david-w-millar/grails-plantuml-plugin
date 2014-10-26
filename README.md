grails-plantuml-plugin
======================

PlantUML grails plugin to generate UML diagrams from grails project sources.
Intended to be useful for generating images for use within grails
project documentation (gdocs).

It is basically a wrapper around the PlantUML ant task that hooks into build events.

I'm shooting for 3 features for the initial release (none of these currently work):
* A script to generate diagrams from PlantUML ( **generate-plantuml-diagrams** )
* A build event hook that generates diagrams and places them in the **grails.doc.images** directory for use in project documentation if it is specified
* A means to embed PlantUml markup directly in grails project documentation



[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/david-w-millar/grails-plantuml-plugin/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

