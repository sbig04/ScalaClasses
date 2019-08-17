object ifelseeg {
  def main(arg: Array[String]){
    
    var x = 3
    val y = if(x < 3)
      println("Value of x is less than 3")
      else
        println("Value of x is greater than or equal to 3")
  }
}