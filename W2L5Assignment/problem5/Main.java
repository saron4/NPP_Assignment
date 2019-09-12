package W2L5Assignment.problem5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer Comp1 = new Computer("Apple", "Itel", 200, 70.3);
		Computer Comp2 = new Computer("Apple", "Itel", 200, 70.3);
		Computer Comp3 = new Computer("Acer", "Core", 70, 23.66);

		System.out.println("Comp1 Equals Com2 : " + Comp1.equals(Comp2));

		System.out.println("Comp1 Equals Comp3 : " + Comp1.equals(Comp3));

	}

	}


