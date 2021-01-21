package PA10;
abstract class Shape{
	protected String name;
	public Shape(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public double area() throws InvalidTriangleException {
		return 0;
	}
	public double perimeter() throws InvalidTriangleException {
		return 0;
	} 
  }