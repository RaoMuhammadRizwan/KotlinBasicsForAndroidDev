fun main() {
    //With the for loop, you can also create ranges of values with "..":

//for(num in 3..12){
//    println(num)
//}
//
//for (a in 3..7){
//    if (a == 7){
//        break
//    }
//    println(a)
//}

    for ( num2 in 1..20){
        if (num2 %2 == 0){
            continue
        }
        println(num2)
    }

    for (chars in 'a'..'z'){
        println(chars)
    }
}