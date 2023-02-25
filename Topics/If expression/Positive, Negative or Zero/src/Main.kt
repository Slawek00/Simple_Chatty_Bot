fun main() {
    val value = readln().toInt()
    println(if(value>0){
        "positive"
    }else if(value<0){
        "negative"
    }else{
        "zero"
    })
}