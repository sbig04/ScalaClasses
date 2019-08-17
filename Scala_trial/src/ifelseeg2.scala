object ifelseeg2 {
  
  def main(arg: Array[String]){
  var marks = 75
  if(marks >= 70)
  {
    println("Distinction")
  } else if (marks >=60 && marks< 70)
    println("First Class")
    else if (marks >=50 && marks< 60)
    println("Second Class")
    else if (marks >=40 && marks< 50)
    println("Pass Class")
    
    else println("Fail")
 }
}