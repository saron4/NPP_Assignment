package LS2Assignment;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int count=0;
		if(args.length>0)
			System.out.println("Arguments Values : " + Arrays.toString(args));
			
			for(int i = 0; i <args.length; ++i) {  
			    System.out.println( "length: "+ args[i].length());
			    if(args[i].startsWith("A") )
			    	count++;
			   
			    
			}
			System.out.println(count);
			 
	      } 

	
		}
		
		
			
		
		

	


