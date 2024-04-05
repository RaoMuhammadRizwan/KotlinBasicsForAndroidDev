fun main(){
//    Kotlin has the following conditionals:
//
//    Use if to specify a block of code to be executed, if a specified condition is true
//    Use else to specify a block of code to be executed, if the same condition is false
//    Use else if to specify a new condition to test, if the first condition is false
//    Use when to specify many alternative blocks of code to be executed


 // KOTLIN IF
    if ( 80 > 20 ) {
        println("80 is greater then 20 ")
    }

    var num1 = 21
    var num2 = 21

    if (num1 >= num2){
        println("NUm1 with value of :$num1 is greater then Num2 with the value of : $num2")
    }

 // KOTLIN ELSE
    val temperature = 23

    if (temperature >= 22) {
        println("Weather is cold outside ")
    }

    else {
        println("Weather is normal ")
    }

    if (num1 >= num2){
        println("Num1 is greater then or equal to Num2")
    }
    else{
        println("Num1 is less then Num2")
    }

// KOTLIN ELSE IF

    var dayToday = "Monday"
    if (dayToday == "Sunday") {
        println("Today is a Holiday")
    }
    else if (dayToday == "Friday"){
        println("Today is Half Day")
        }
    else {
        println("Today is Working Day ")
        }

    val time = 13
    val greetings = if (time >= 12 ) {
        println("Good AfterNoon")
    }
    else {
        println("Good Morning")
    }


}

