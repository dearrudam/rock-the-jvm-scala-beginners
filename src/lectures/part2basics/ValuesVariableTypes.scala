package lectures.part2basics

/**
 *
 */
object ValuesVariableTypes extends App {
  val x: Int = 333
  println(x)
  val x1 = 333
  // VAL ARE IMMUTABLE
  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val anInt: Int = x
  val aShort: Short = 12312
  var aLong: Long = 2134324234234234L
  val aFloat: Float = 4.0f
  val aDouble: Double = 23.33

  // Variables
  var aVariable: Int = 4
  aVariable = 5 // side effects

  // PREFER VALS OVER VARS
  // ALL VALS AND VARS HAVE TYPES
  // COMPILER AUTOMATICALLY INFERS TYPES

}
