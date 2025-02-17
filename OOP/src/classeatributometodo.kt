class Pessoa(val anoNasimento: Int, var nome: String){
    var doc: String = ""

    constructor(anoNasimento: Int, nome: String, doc: String):this(anoNasimento, nome){
        this.doc = doc
    }

    fun dormir(){

    }

    fun acordar(){

    }
}

class Vazia private constructor()

fun main() {
    //class - comportamentos e atributos

    // classe -> objetos
    var pessoa: Pessoa = Pessoa(1998, "Rogério", "asdas")

    //this se refere ao objeto gerado pela classe
    //this é o escopo da instância da classe

    println("Meu nome é ${pessoa.nome}")
    pessoa.dormir()
    pessoa.acordar()
}