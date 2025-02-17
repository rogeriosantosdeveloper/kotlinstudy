fun main(){
    println(media(1F, 2F, 3F, 4F))
}

fun media(vararg notas: Float): Float{
    var soma = 0f

    for(n in notas){
        soma += n
    }

    return (soma / notas.size)
}