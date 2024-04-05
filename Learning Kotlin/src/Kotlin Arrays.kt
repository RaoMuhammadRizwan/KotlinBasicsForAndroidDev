fun main(){
    val pslFranchise = arrayOf("Lahore", "Karachi" , "Multan", "Quetta", "Peshawar" , "Islamabad")
    println("My Favourite team : " + pslFranchise[0])
//You can access an array element by referring to the index number, inside square brackets

    //Change an Array Element
    //To change the value of a specific element, refer to the index number:

    pslFranchise[1] = "Faislabad"
    println(pslFranchise.contentToString())

    //Array Length / Size
    //To find out how many elements an array have, use the size property:

    println(pslFranchise.size)

    //Check if an Element Exists
    //You can use the in operator to check if an element exists in an array:

    if("Lahore" in pslFranchise){
        println("It Exists...")
    }else {
        println("It doesnt Exists...")
    }

    val favouriteTeam = "Quetta"
    if (favouriteTeam in pslFranchise){
        println("Your Favourite PSL team $favouriteTeam Exists in the List.")
    }else {
        println("Your Favourite PSL team $favouriteTeam doesnt Exists in the List.")
    }

   //Loop Through an Array

    val iplFranchise = arrayOf("RCB", "CSK", "MI", "PK", "SRH", "GT", "LSG", "DC", "RR", "KKR")

    for ( x in iplFranchise){
        println(x)
    }




}