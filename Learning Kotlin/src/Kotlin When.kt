fun main(){
    //Instead of writing many if..else expressions, you can use the when expression, which is much easier to read.

    val day = 10

    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"

        else -> "Invalid Day"
    }
    println("Today is $result")
//

    val rainbowColour = "blue"
    val displayColour = when (rainbowColour){
        "Blue" -> "BlueBerry"
        "Yellow" -> "Banana"
        "Green" -> "Pear"
        "Red" -> "Chery"
        "Orange" -> "Oranges"
        "Violet" -> "You Can Choose any Fruit"
        "Indigo" -> "You Can Not Choose any Fruit"
    else -> "Invalid"

    }
    println("You Selected $rainbowColour Colour So you can have : $displayColour")


}