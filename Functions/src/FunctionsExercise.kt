import kotlin.time.Duration.Companion.seconds

fun main(){
    /*println("Bem vindo a lista de atividades!")
    println("1- Converter anos para meses, dias, horas e segundos")
    println("2- Informar quantidade de caracteres em uma string")
    println("3- Calcular cubo de um número")
    println("4- Transformar milhas em km")
    println("5- Transformar celcius em farenheit")
    println("6- Trocar as letras de a para x")
    print("Escolha a opção: ")
    val option = readLine()

    when(option){
        1.toString() -> calendar()
        2.toString() -> charqtd()
        3.toString() -> cubo()
        4.toString() -> milhaskm()
        5.toString() -> celciusFarenheit()
        6.toString() -> alternarAParaX()
    }*/

    println(question2("Palavra"))
    println(question3(5))
    println(question4(100F))
    println(question5(32F))


}

//receber anos e transformar em meses, dias, horas, minutos e segundos
fun calendar(){
    println()
    print("Informe a quantidade de anos: ")
    val anos = readLine().toString().toInt()

    val meses = 12 * anos
    val dias = 365 * anos
    val horas = 24 * dias
    val minutos = 60 * horas
    val segundos = 60 * minutos

    println("Quantidade de meses: $meses")
    println("Quantidade de dias: $dias")
    println("Quantidade de horas: $horas")
    println("Quantidade de minutos: $minutos")
    println("Quantidade de segundos: $segundos")

}


//receber string e tornar qtd caracteres
fun charqtd(){
    println("Informe a string para ser descoberta a quantidade de caracteres: ")
    val str = readLine().toString()

    println("A quantidade de caracteres são: ${str.length}")

}

//calcular cubo de um numero
fun cubo(){
    print("Informe um número para descobrir o cubo: ")
    val cubo = readLine().toString().toInt()

    val resultado = cubo * cubo * cubo

    println("Seu resultado é: $resultado")
}

//receber milhas e converter em km (1 milha = 1.6km)
fun milhaskm(){
    print("Informe a quantidade de milhas que você deseja descobrir: ")
    val milhas = readLine().toString().toInt()

    val km = 1.6 * milhas

    println("Seu resultado é: $km km")
}

//receber celcius e convereter fahrenheit (F = C * 9/5) + 32
fun celciusFarenheit(){
    print("Informe a temperatura em celcius: ")
    val celcius: Float = readLine().toString().toFloat()

    val farenheit = (celcius * 9 / 5) + 32

    println("Sua temperatura em farenheit é: $farenheit")
}

//trocar as letras de a para x
fun alternarAParaX(){
    println("Informe a frase que deseja substituir: ")
    val frase = readLine().toString()

    println("Sua nova frase é: ${frase.lowercase().replace("a", "x")}")
}

//questões 2, 3, 4, 5 em uma unica linha
fun question2(str: String): Int = str.length

fun question3(num: Int): Int = num * num * num

fun question4(milhas: Float): Float = milhas * 1.6F

fun question5(celcius: Float): Float = (celcius * 9 / 5) + 32
