fun main() {
    var greetings = "Assalam o Alikum"
    var salam : String = "AOA"

 //Access A String

//To access the characters (elements) of a string, you must refer to the index number inside square brackets.
//String indexes start with 0. In the example below, we access the first and third element in txt:
    println(salam[0])
    println(greetings[3])

//String Length

//by writing a dot character (.) after the specific string variable.
//the length of a string can be found with the length property

    println(salam.length)
    println(greetings.length)
    println("The length of greeting : " + greetings.length)

// Upper and LowerCase
    val name = "rao RIZWAN"
    println(name.uppercase())
    println(name.lowercase())


//Comparing Strings
    var text1 = "Hello"
    var text2 = "hello"

    println(text1.compareTo(text2))
    println(text1.compareTo("Hello"))


// Finding a String in a String
//The indexOf() function returns the index (the position)
// of the first occurrence of a specified text in a string (including whitespace)

    var txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))

    var txt3 = "hello my name is Khan"
    println(txt3.indexOf("is"))


//StringTemplates/Interpolation
//  Instead of concatenation, you can also use "string templates",
// which is an easy way to add variables and expressions inside a string.


}