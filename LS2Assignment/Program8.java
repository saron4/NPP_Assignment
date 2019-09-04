package LS2Assignment;

public class Program8 {

	public static void main(String[] args) {
		 int result =   minNumber(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
		System.out.println(result);
		result =   minNumber(new int[]{});
		System.out.println(result);
	}
 public static int minNumber(int[] number) {
	 if(number.length == 0) {
		 return 0;
	 }else {
		 for (int i = 0; i < number.length; i++)   
         {  
             for (int j = i + 1; j < number.length; j++)   
             {  
                 if (number[i] > number[j])   
                 {  
                    int  tempMin = number[i];  
                     number[i] = number[j];  
                     number[j] = tempMin;  
                 }  
             }  
         }  
        return number[0];  
 }  
	 
	  
	
 }
 }
