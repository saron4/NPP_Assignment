package W2L5Assignment.problem1;

public class Main {

	public static void main(String[] args) {
		
		Shape[] sh = { new Rectangle("Red" , 3.45, 4.5),
					   new Circle("Yellow", 5),
					   new Square("Blue" ,5)
		
		};
		
		printTotal(sh);
			
		}
	
	public static void printTotal(Shape[] sh)
	 { // Implement your code
		double totalSumOfArea = 0.0;
		double totalSumOfPerimeter = 0.0;
		for(Shape shape: sh) {
			totalSumOfArea += shape.calculateArea();
			totalSumOfPerimeter += shape.calculatePerimeter();
		}
		System.out.println("The total area sum is:" +totalSumOfArea);
		System.out.println("The total perimeter sum is:" +totalSumOfPerimeter);
	 } 
}
