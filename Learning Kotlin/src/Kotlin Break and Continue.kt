fun main(){
    //The break statement is used to jump out of a loop.
    var num = 0
    while(num < 10){
        println(num)
        num++

        if (num == 5){
            break
        }
    }

    //The continue statement breaks one iteration (in the loop),
// if a specified condition occurs, and continues with the next iteration in the loop

    var i = 0
    while(i<12){

        if (num %2 == 0){
            i++
            continue
        }
        println(i)
        i++
    }

}