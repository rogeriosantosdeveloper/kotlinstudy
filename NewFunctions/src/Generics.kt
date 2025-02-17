fun main(){
    println(medias("Alguma coisa", 2F, 3F, 4F))

    
}

//Generics
//Em tempo de compilação nem o código sabe o tipo que está recebendo, será descoberto somente no tempo de execução
fun <T, J> medias(abc: J, vararg notas: T): Float{
    var soma = 0f

    for(n in notas){
        if(n is String){
            println("Você passou uma string")
        } else if (n is Float) soma += n else println("não descobri o tipo")
    }

    return (soma / notas.size)
}