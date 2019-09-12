package W2L5Assignment.problem3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure array[] = new Figure[5];
		

		array[0] = new UpwardHat(); 
		array[1] = new UpwardHat(); 
		array[2] = new Downwards();
		array[3] = new FaceMaker(); 
		array[4] = new Vertical();
		
	for (Figure figure : array) {
		figure.getFigure();

	}

	System.out.println(); 
	for (Figure figure : array) {
		System.out.print(figure.getClass().getSimpleName() + ": "); 
		figure.getFigure();

	System.out.println();
	}}
}
