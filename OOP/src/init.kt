class Animal(var especie: String){
    var fala: String = ""
        get(){
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }

    init {
        if(especie == "cachorro"){
            fala = "au"

        }
    }

    init {
        if(especie == "gato"){
            fala = "meow"
        }
    }

    fun falar(){
        println(fala)
    }
}

fun main(){
    var p: Planeta = Planeta()

    var a = Animal("cachorro")
    a.fala = "auuu"
    println(a.fala)

}