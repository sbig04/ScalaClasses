package inheritance

class Rectangle(var width : Double, var length: Double) extends Polygon {
 override  def area : Double = length* width;
}