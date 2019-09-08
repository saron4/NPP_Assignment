package L3Assignment.problem4;

public final class Circle {
	
	private final double radius;
	public Circle(double radius) {
	super();
	this.radius = radius;
		}
	
	public double getRadius() {
		return radius;
	}
	public double computeArea(){
		return (Math.PI*Math.pow(radius,2));
	}
}
