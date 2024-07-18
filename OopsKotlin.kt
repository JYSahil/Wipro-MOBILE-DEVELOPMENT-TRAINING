open class Vehicle() {
    val tyres = 4
}
class Car(var name: String, var model: String, var price: Int): Vehicle() {
     fun drive() {
         println("$name is driving")
         }
     fun tyresStatus() {
         println(tyres)
         }
}
fun main() {
    val bmw = Car("M3", "M", 100) /*bmw.name="M3"
 bmw.model="M"
 bmw.price=100*/

    println(bmw.tyresStatus())
}