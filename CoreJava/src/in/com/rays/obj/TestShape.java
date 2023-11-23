package in.com.rays.obj;

public class TestShape {

	public static void main(String[] args) {
		Shape s= new Shape();
		s.shapeArea();
		Rectangle r= new Rectangle();
		r.rectangleArea();
		Shape shape= new Rectangle();
		shape.shapeArea();
		Rectangle rectangle=(Rectangle)shape;
		rectangle.rectangleArea();

	}

}
