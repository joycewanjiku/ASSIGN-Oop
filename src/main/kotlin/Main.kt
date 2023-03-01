
fun main() {
    val  person = Human ("mercy",54,68)
    person.eat(43)
    person.weight
    person.speak("welcome to school")
    person.birthday()
    var data =User("njeri","jojo","wanjajoy@gmail.com","078888766544",8776654)
    println(data.email)
    println(data.lastName)


}
class  Human(var name:String,var age:Int ,var weight:Int){
    fun eat(foodweight:Int){
        println("i am eating $foodweight kgs of food")


        //and increments the human’s weight by the weight of the food eaten
        weight *=foodweight
        println(weight)
    }
    //speak(speech: String) :Prints the string passed to it
    fun speak(speech:String){
        println(speech)

    }
    //birthday( ) :Increments the human’s age by 1
    fun birthday(){
        age+=1
        println(age)
    }
    //Create a data class User with these fields: firstName, lastName, email,
    //phoneNumber, password. Create an instance of User and print out any 2
    //attributes


}
class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int,)



