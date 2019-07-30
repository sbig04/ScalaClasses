object higherOrderFunctionEg {
  def main(arg: Array[String]){

    def id(x: Int) : Int = x
    
    def sumInt(a: Int, b: Int) : Int = { 
      if (a > b) 0 else id(a) + sumInt(a + 1, b)      
    }
        
    def square(x: Int) : Int = x * x

    def sumsquare(a: Int, b: Int) : Int = {
       if (a > b) 0 else square(a) + sumsquare(a + 1, b)
    }
    
    def poweroftwo(x: Int) : Int = if (x == 0) 1 else 2 * poweroftwo(x - 1)
    
    def sumofpoweroftwo(a: Int, b:Int) : Int ={
      if (a > b) 0 else poweroftwo(a) + sumofpoweroftwo(a + 1, b)
      
    }
     
     //Functional Programming    
     def sum(f: Int => Int, a: Int, b:Int) : Int  = {
       if (a > b) 0 else f(a) + sum(f, a + 1, b)
     }
    
    println("The sum of numbers is :" +sumInt(2,5)) // 2 + 3 + 4 + 5 =14
    println("The sum of squares of numbers is :" +sumsquare(2,5)) // 4 + 9 + 16 + 25 =54
    println("The sum of powers of two is : " +sumofpoweroftwo(2,4)) // 4 + 8 + 16 = 28
    println("============================================================")
    println("The sum of numbers is :" +sum(id,2,5)) // 2 + 3 + 4 + 5 =14
    println("The sum of squares of numbers is :" +sum(square,3,5)) // 4 + 9 + 16 + 25 =54
    println("The sum of powers of two is : " +sum(poweroftwo,2,4)) // 4 + 8 + 16 = 28 
  }
}