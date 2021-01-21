package PA10;
public class Rectangle extends Shape{
	protected double length, width;
	public Rectangle(double length, double width, String name) {
		super(name);
		this.length=length;
		this.width=width;
	}
	public double area() {
		return length * width;
	}
	public double perimeter() {
		return 2*(length+width);
	}
  }
