package exercicios.tenquestionsgpt

fun main(){
    val texto = "Kotlin é incrivel!"
    println("Numero de vogais: ${texto.contarVogais()}")
}

//Qualquer string poderá chamar essa função como se fosse um método
fun String.contarVogais(): Int {
                //Conjunto imutável sem ordem definida, a diferença entre set e list é que o list aceita valores repetidos e mantém a ordem de inserção, enquanto o set não.
                //Exemplos:
                //val meuSet = setOf(1, 2, 3, 3, 4) o resultado sera de 1 a 4
                //val minhaLista = listOf(1, 2, 3, 3, 4) o resultado sera: 1, 2, 3, 3, 4
    val vogais = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    //this propria string que chama função, it in vogais, percorrer cada caractere e conta quantos há
    return this.count { it in vogais }
}