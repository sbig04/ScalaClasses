package inheritance

class Triangle(var width : Double, var length: Double) extends Polygon {
 override def area : Double = length*width /2;
}

