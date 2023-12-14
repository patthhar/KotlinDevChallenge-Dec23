package week_1

data class Coordinates(
  val x: Double,
  val y: Double
)

infix operator fun Coordinates.plus(c: Coordinates): Coordinates {
  return Coordinates(this.x + c.x, this.y + c.y)
}

fun main() {
  val a = Coordinates(1.1, 1.0)
  val b = Coordinates(0.1, -1.2)

  val d = a plus b
  val e = a plus(b)
  val f = a.plus(b)
  val g = a + b

}
