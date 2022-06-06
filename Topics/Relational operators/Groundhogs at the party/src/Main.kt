fun main() {
    // write your code here
    val butterCups= readln().toInt()
    val isWeekend= readln().toBooleanStrictOrNull()
    var isPartySuccesful=false
    if(butterCups in 10..20 && !isWeekend!!){
        isPartySuccesful = true
    } else if(butterCups in 15..25 && isWeekend!!){
        isPartySuccesful = true
    }
    println(isPartySuccesful)
}