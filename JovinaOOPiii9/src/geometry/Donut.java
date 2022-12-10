package geometry;

public class Donut extends Circle {
	private int innerR;
	
	public Donut() {
	
	}

	public Donut(Point center, int r, int innerR) {
		super(center, r);
		this.innerR = innerR;
	}

	public Donut(Point center, int r, boolean selected, int innerR) {
		super(center, r, selected);
		this.innerR = innerR;
	}

	@Override
	public String toString() {
		return super.toString() + ", inner radius: " + innerR;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Donut d1 = (Donut) obj;
			return super.getCenter().equals(d1.getCenter()) && super.getR() == d1.getR() && innerR == d1.innerR;
		}
		return false;
	}

	@Override
	public double circumference() {
		return super.circumference() + 2*innerR*Math.PI;
	}

	@Override
	public double area() {
		return super.area() - innerR*innerR*Math.PI;
	}

	public int getInnerR() {
		return innerR;
	}

	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}
}
