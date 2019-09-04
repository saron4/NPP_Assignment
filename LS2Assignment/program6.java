package LS2Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class program6 {

	public static void main(String[] args) {
		
		String[] str = {"horse", "dog", "cat", "horse","dog"};
        
        System.out.println("Original array: " 
                    + Arrays.toString(str));
        
        LinkedHashSet<String> lhSetColors =  
                new LinkedHashSet<String>(Arrays.asList(str));
        
        String[] newArray = lhSetColors.toArray(new String[ lhSetColors.size() ]);
        
        System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
 
    }
}

	
