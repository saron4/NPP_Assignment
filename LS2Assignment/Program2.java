package LS2Assignment;

public class Program2 {

	public static void main(String[] args) {
		
		float num1 = (float) 1.27 ;
		float num2 = (float) 3.881;
		float num3 = (float) 9.6;
		
		float sum1 = (int)num1 + num2 + num3;
		System.out.println(sum1);
		float roundSum = (int)(Math.round(num1 + num2 + num3));
		System.out.println(roundSum);
		

	}

}
