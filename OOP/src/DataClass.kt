
fun main(){
    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData= FormaData(10, 8)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())

    println("----------------------------")


    println(f2.toString())
    println(f2.hashCode())

    f2 = f1.copy(20)

}

class Forma(val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {
        return if(other is Forma){
            other.a == this.a && other.b == this.b
        } else {
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }
}
data class FormaData(val a: Int, val b: Int)


data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco){}