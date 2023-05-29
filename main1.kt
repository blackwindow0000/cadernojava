fun main() {
  println("Qual é sua idade: ")
  val idade = readLine()!!
  println("Sua idade é " +idade)

  val num = idade.toInt()

  if (num >= 18)
    println("Você é maior de idade")
    else
      println("Você é menor de idade")
    
  
  
  

}