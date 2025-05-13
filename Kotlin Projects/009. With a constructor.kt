class Point(var x: Int, var y: Int)
class Size(var width: Int, var height: Int)
class Rect(var size: Size, val point: Point)

fun main(args: Array<String>) {
    val rect = Rect(Size(10, 10), Point(5, 5))

    println(rect.point.x)
    println(rect.size.height)
}