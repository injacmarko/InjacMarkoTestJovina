package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3, 5);
		Point p1 = new Point(3, 5);
		System.out.println(p);
		Line l = new Line(p, new Point(5,7));
		Line l1 = new Line(p, new Point(5,7));
		System.out.println(l);
		Circle c = new Circle(p, 5);
		Circle c1 = new Circle(p, 5);
		System.out.println(c);
		Rectangle r = new Rectangle(p, 10, 10);
		Rectangle r1 = new Rectangle(p, 10, 10);
		System.out.println(r);
		System.out.println(c.equals(c1));
	}
	
}
