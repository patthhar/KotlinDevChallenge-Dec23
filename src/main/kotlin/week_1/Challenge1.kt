package week_1

// https://androidpro.io/kdt-1/
// Challenge 1

// function should return text with input. Example:
// input: birds
// output: Kotlin is awesome and so called "birds" fly key
// Note that in expected output word "birds" is in ""
// how to handle special cases? Modify createContent function.

fun createContent(input: String): String {
  var text = "Kotlin is awesome and so called ??? fly key"
  text = text.replace("???", "\"$input\"")
  return text
}

fun main() {
  val input = "bird"
  println(createContent(input))
}