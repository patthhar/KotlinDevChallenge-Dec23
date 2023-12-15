package week_1

// https://androidpro.io/kdt-3/
// Challenge 3

// Write a function that takes a natural number
// and returns its successive digits as a list
// (e.g., for the number 1234, it returns listOf(1, 2, 3, 4).

fun solve(input: Long): List<Int> {
  var num = input
  val digits = mutableListOf<Int>()
  if (num == 0L) digits.add(0)
  while (num > 0) {
    digits.add((num % 10).toInt())
    num /= 10
  }
  return digits.reversed()
}

fun main() {
  println(solve(0))
}