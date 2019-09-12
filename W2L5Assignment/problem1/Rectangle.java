package W2L5Assignment.problem1;

public class Rectangle extends Shape{
 protected double width, height;
 
 public Rectangle( String color, double width, double height){
	 super(color);
	 this.width = width;
	 this.height = height;
 }
 @Override
 public double calculateArea() {
	 
		return (width * height);
	}
	public  double calculatePerimeter() {
		return (2 * width + 2 * height);
	}
 
}
