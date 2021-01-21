package PA10;
public class Triangle extends Shape{
	protected double length, width, c;
	public Triangle(double c,double length,double width,String name) {
		super(name);
		this.length=length;
		this.width=width;
		this.c=c;
	}
	public boolean isvalid() throws InvalidTriangleException {
		if ( (length+width > c) && (length+c > width) && (width+c > length) ) {
			return true;
		}
		else {
			throw new InvalidTriangleException("Sum of two sides must be > the third >:-(");
		}
	}
	public double perimeter() throws InvalidTriangleException{
		if (isvalid()) {
			return length+width+c;
		}
		else {
			return -1;
		}
	}
	public double area() throws InvalidTriangleException{
		if (isvalid()) {
			double s = (length+width+c)/2;
			return Math.sqrt(s*(s-length)*(s-width)*(s-c));
		}
		else {
			return -1;
		}
	}
}