fun main() {
    // The while loop loops through a block of code as long as a specified condition is true

    var i = 9
    while (i <= 10){
        println(i)
        i++
    }

    var countdown = 3
    while (countdown >= 0){
        println("Time Remainig : $countdown sec")
        countdown --
    }

    // Do not forget to increase the variable used in the condition, otherwise the loop will never end.


//The Do..While LOOP

    //The do..while loop is a variant of the while loop.
// This loop will execute the code block once, before checking if the condition is true,
// then it will repeat the loop as long as the condition is true.

    var time = 10
    do {
        println("Time Remainig = $time MiN ")
        time ++
    }
        while (time < 12)





}