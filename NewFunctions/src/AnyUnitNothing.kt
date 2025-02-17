@file:Suppress("UNREACHABLE_CODE")

fun main(){
    //Em diversos cenários o any age da mesma forma que Generics
    //Unit não tem retorno, você pode simplesmente não declarar.
    //Nothing é um tipo de dado, onde seu principal caso de uso é retornar uma exceptions da função
    valores(false)
    save()
    update()
}

fun valores(value: Any): Any{
    return 1
}

fun save(): Nothing{
    TODO("Não implementado")
}

fun update(): Nothing {
    TODO("Não implementado")
}