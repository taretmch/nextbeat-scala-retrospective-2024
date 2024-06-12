//> using scala 3.4.2

// Subtyping
trait Shape:
  def area: Double

class Circle(val radius: Double) extends Shape:
  def area: Double = math.Pi * radius * radius

class Rectangle(val width: Double, val height: Double) extends Shape:
  def area: Double = width * height

// Algebraic Data Type
enum ShapeADT:
  case Circle(radius: Double)
  case Rectangle(width: Double, height: Double)

def area(shape: ShapeADT): Double = shape match
  case ShapeADT.Circle(radius) => math.Pi * radius * radius
  case ShapeADT.Rectangle(width, height) => width * height
