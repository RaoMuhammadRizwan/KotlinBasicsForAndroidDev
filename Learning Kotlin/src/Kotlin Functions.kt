fun main() {
    //A function is a block of code which only runs when it is called.
    //You can pass data, known as parameters, into a function.
    //Functions are used to perform certain actions, and they are also known as methods.

    //Predefined Functions
    println("println is a predefined function")

    //we have to call our own function in the Main Function so it can be executed
    myFunction()
    myFunction()
    functionParameter("Rizwan")
    functionParameter("Rao")
    argumentFunction("Rao Rizwan", 23)

    var result = function1(12)
    println(result)



}
//Create Your Own Functions
    fun myFunction(){
        println("This is my own function")
    }

    fun functionParameter(fullName: String){
        println("My Name is : $fullName")
    }

//When a parameter is passed to the function, it is called an argument.
    fun argumentFunction(Name : String, Age : Int){
        println("My Name is $Name and I am $Age years old")
    }
//Return Values
//we will use a function to return a value and assign it to a variable.
    fun function1(x:Int):Int{
        return(x + 12)
    }
