/*

Here's an embedded diagram

@startuml
class EmbeddedGroovyDiagram {
  name : String
  -thing : Object
  #data : byte[]

  {static} doABarrelRoll() : void
  getName() : String

  -- crypted --
  password : String
}
@enduml

*/

class EmbeddedGroovyDiagram {
  String name
  String password
  private def thing
  protected byte[] data

  static doABarrelRoll(){
    println "WOH!"
  }

  String getName(){
    name
  }


}
