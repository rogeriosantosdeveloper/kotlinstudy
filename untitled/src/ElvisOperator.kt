fun main (){
    val str: String? = null

    println(str ?: "nulo")

    val idade = 18

    //Por isso não existe operador ternário no Kotlin
    val maiorIdade = if(idade >= 18) "Maior de idade" else "Menor de idade"

}