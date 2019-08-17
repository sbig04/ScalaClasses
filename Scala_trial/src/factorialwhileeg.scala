/* Fact 5 = 5*4*3*2*1 = 120 */

object factorialwhileeg {
  def main(arg: Array[String]){
    
    var factresult = 1
    var num = 5
    while(num >0){
      factresult = factresult * num
      num = num - 1
    }
    println(factresult)
  }
}