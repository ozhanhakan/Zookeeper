fun main() {
    // put your code here
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    var numberPositives = 0

    if (n1 > 0) numberPositives++
    if (n2 > 0) numberPositives++
    if (n3 > 0) numberPositives++
    println(numberPositives==1)

}