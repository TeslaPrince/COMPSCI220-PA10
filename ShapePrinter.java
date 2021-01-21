package PA10;
public class ShapePrinter{
	public static void print(Shape name) {
		System.out.println("Details for : "+ name.getName());
		try {
			System.out.println("Perimeter is : "+ name.perimeter());
		}
		catch (InvalidTriangleException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Area is : "+ name.area());
		}
		catch (InvalidTriangleException e) {
			e.printStackTrace();
		}
	}
}