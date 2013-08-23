/**
 * Build event hooks for PumlDiagram generation
 */

includeTargets << grailsScript('_GrailsPackage')
includeTargets << grailsScript('_GrailsEvents')
includeTargets << new File("$plantumlPluginDir/scripts/_PlantUML.groovy")

final String REF_DOC_TYPE = 'refdocs'

// Generate diagrams for inclusion in docs
eventDocStart = { type ->
    if(type == REF_DOC_TYPE)
      ant.sequential.createPumlDiagrams()
}

eventDocEnd = { kind ->
    if(type == REF_DOC_TYPE)
      ant.cleanPumlDiagrams()
}


target(registerDocExtensions: 'Registers the plantuml gdoc macro') {
  event("StatusUpdate", ["Registering custom doc extensions"])
  org.radeox.macro.MacroLoader.newInstance().add(
    org.radeox.macro.MacroRepository.instance,
    new org.radeox.macro.Preserved() {

      @Override
      String getName() {
        'plantuml'
      }

      @Override
      void setInitialContext(org.radeox.api.engine.context.InitialRenderContext context) {
        super.setInitialContext(context)
      }

      @Override
      void execute(Writer writer, org.radeox.macro.parameter.MacroParameter params) {
        def content = replace(org.radeox.util.Encoder.unescape(params.content))
        if (params.length == 0) {
        writer << content
        } else if(params.length==1) {
        def anchorName = params.get(0).replaceAll(/[^a-zA-Z0-9-]/, '')
        writer << '<a href="#'+anchorName+'">' << content << '</a>'
        } else {
        def pageName = params.get(0)
        def anchorName = params.get(1).replaceAll(/[^a-zA-Z0-9-]/, '')
        writer << '<a href="'+pageName+'.html#'+anchorName+'">' << content << '</a>'
        }
      }
    }
  )
  event("StatusUpdate", ["Finished registering plantuml macro"])
}




