package W2L5Assignment.problem6;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person P1 = new Person("Paul", new Computer("Apple", "rem", 6600, 70.6));

		System.out.println("Before Cloning the values of P1 are");
		System.out.println(P1);
		System.out.println("\n");

		Person P2 = (Person) P1.clone();
		System.out.println("After Cloning the values of P2 are");

		System.out.println(P2);

		P1.getComputer().setRamSize(400);
		System.out.println("\n" + "After Changing RAMSIZE For P1-Shallow clonning");
		System.out.println(P1 + "\n" + P2);

		/*System.out.println("\n" + "After Changing RAMSIZE For P1-Deep clonning");
		System.out.println(P1 + "\n" + P2);

		/*
		 * System.out.println("Before Cloning"); System.out.println(addObj);
		 * 
		 * CloneExp cloAdd= (CloneExp) addObj.clone();
		 * System.out.println("After Cloning"); System.out.println(cloAdd);
		 * 
		 * addObj.address.setHouseNo("11A");
		 * System.out.println("After Modifing the House No.");
		 * System.out.println(cloAdd);
		 */
	}

	}


