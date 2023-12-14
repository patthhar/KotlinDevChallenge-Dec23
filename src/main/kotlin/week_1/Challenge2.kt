package week_1

// https://androidpro.io/kdt-2/
// Challenge 2

// the function should return a list with only unique elements
// input: listOf("1","2","3","3")
// output: listOf("1","2","3")

fun returnUnique(input: List<String>): List<String> {
  val unique = input.toSet()
  return unique.toList()
}