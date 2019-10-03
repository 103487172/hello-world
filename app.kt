fun main() {

        println("x = $x; PI = $PI")
        incrementX()
        println("incrementX()")
        println("x = $x; PI = $PI")

        val result = maxOf(10, 6)
        println(result)

    val sum = 10 + 9
    println(sum)

    println("Phan Nhat Minh")

    println(a1)

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)}

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

val PI = 3.14

var x = 0
fun incrementX() {
    x += 1
}


fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

var a=1
val a1 = "to be continue"

