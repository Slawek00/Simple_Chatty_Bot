fun main() {
    // put your code here
    var value = readln().toInt()
    while(value>1){
        print("$value ")
        if(value % 2 == 0){
            value /= 2
        }else{
            value = value*3+1
        }

    }
    print("$value")
}