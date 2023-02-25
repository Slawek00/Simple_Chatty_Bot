fun main() {
    val iteration = readln().toInt()
    var elementDiviedbyfour = 0

    repeat(iteration){
        val input = readln().toInt()
        if(input % 4 == 0 && input > elementDiviedbyfour){
            elementDiviedbyfour = input
        }
    }

    println(elementDiviedbyfour)

}