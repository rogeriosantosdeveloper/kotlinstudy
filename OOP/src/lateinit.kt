class Receita{
    //Não vai existir na memória enquanto não for inicializada
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "lave as mãos."
    }

    fun imprimereceita(){
        if (!this::instrucoes.isInitialized){
            instrucoes = "lave as mãos."
        }
    }
}

fun main(){
    var r: Receita =  Receita()

    println(r.geraReceita())
}