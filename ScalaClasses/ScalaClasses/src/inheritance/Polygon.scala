package inheritance

class Polygon {
    def area: Double = 0.0;
}
object Polygon{
  def main(args: Array[String]){
    var poly= new Polygon;
    var rect= new Rectangle(10.0, 20.0);
    var tri= new Triangle(10.0, 20.0);
    printArea(poly);
    printArea(rect);
    printArea(tri);
  }
  def printArea(p:Polygon){
    println(p.area);
  }
}