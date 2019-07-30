

object funcByNameEg {
  def main(arg: Array[String]){
   
   def time() : Long ={
     println("Inside Time Function")
     return System.nanoTime()
   }
    
   def exec(t: => Long) : Long = {
     println("Inside Exec Function")
     println("Time :" +t)
     println("Exiting from Exec Function")
     return t
      }

   println("Main Function :" + exec(time()))
    
    }

}