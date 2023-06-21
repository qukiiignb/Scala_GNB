
/*@ main
 * @ main annotation is used to define the entry point of a Scala application*/
/* def
 * def: It is the keyword used to define a method.*/
/* Unit
 * When a function or method doesn't return any useful result, its return type is usually specified as Unit.*/
/* println
 * Prints out an object to the default output*/
@main def hello: Unit =
  println("Hello world!")
  println(msg)

/* msg
 * msg" is a commonly used shorthand or abbreviation for "message." It is often used as a variable name or parameter name*/
def msg = "I was compiled by Scala 3. :)"
