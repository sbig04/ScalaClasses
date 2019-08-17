
object classEg {
  def main(arg: Array[String]){
    var ob = new NewClass("Hello World!!")
    var ob1 = new NewClass("Hello India!!")
    var ob2 = new NewClass("Hello Shruti!!")

    ob.sayHi()
    ob1.sayHi()
    ob2.sayHi()
  }
}

class NewClass(mssg: String){
  def sayHi() = println(mssg)
}
