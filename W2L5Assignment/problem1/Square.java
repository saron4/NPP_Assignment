package W2L5Assignment.problem1;

public class Square extends Rectangle {
	
	protected double side;
	Square(String color, double side ){
		super(color, side , side);
		this.side = height;
		this.side = width;
	}
	
	@Override
	
	public double  calculateArea() {
		return ( Math.sqrt(side));
	}
		public double  calculatePerimeter() {
		return (4 * side);
	}
	
}
