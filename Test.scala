import Test.MyLocalMessage
import tutorial.macro_proto.MyMessage
import tutorial.macro_proto.MyMessage2;

class Test {
  // The parameter macro fails to resolve.
  MyMessage(`macro` = "string")







  // An ~equivalent case class defined in the companion object with a parameter called macro works.
  MyLocalMessage(`macro` = "string")

  // A proto message with the field macro2 resolves.
  MyMessage2(macro2 = "string")
}

private object Test{
  final case class MyLocalMessage(`macro`: String)
}