fun main() {
    portaria()
}

fun portaria() {

    print("Qual a sua idade? ")
    val idade = readLine()

    if(idade != null && idade != ""){
        if(idade.toInt() < 18){
            println("Negado. Menores de idade não são permitidos")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if(tipoConvite != null && tipoConvite != ""){
        tipoConvite = tipoConvite.lowercase()

        if(tipoConvite != "comum" && tipoConvite != "premiuim" && tipoConvite != "luxo"){
            println("Negado. Convite inválido.")
            return
        }

        print("Qual é o codigo do convite? ")
        var codigo = readLine().toString()

        if(tipoConvite == "comum" && codigo != ""){
            codigo = codigo.lowercase()

            if(tipoConvite == "comum" && codigo.startsWith("xt")){
                println("Welcome! :)")

            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")){
                println("Welcome! :)")
            } else {
                println("Negado. Convite invalido")
            }
        }
    }
}
