package L3Assignment.problem4;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter C for circle \nEnter R for rectangle \nEnter T for trinagle");
			String x = scan.nextLine();
			if(x.equalsIgnoreCase("c")){
				System.out.println("Circle ");
				System.out.println("Enter radious: ");
				double r = scan.nextDouble();
				Circle C = new Circle(r);
				System.out.printf("Area of the Circle is :%.2f",C.computeArea());
			}
			else if(x.equalsIgnoreCase("r")){
				System.out.println("Rectangle ");
				System.out.println("Enter base: ");
				double b = scan.nextDouble();
				System.out.println("Enter hight:");
				double h = scan.nextDouble();
				Rectangle R = new Rectangle(b,h);
				System.out.printf("Area of the Rectangle is :%.2f",R.computeArea());
			}
			else if (x.equalsIgnoreCase("t")){
				System.out.println("Triangle");
				System.out.println("Enter base: ");
				double b = scan.nextDouble();
				System.out.println("Enter hight:");
				double h = scan.nextDouble();
				Triangle T = new Triangle(b,h);
				System.out.printf("Area of the Triangle is %.2f", T.computeArea());
			}
			else{
				System.out.println("Wrong entry . . . try again");
			}
		}
	}

