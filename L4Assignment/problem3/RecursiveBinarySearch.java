package L4Assignment.problem3;

import java.util.Arrays;

public class RecursiveBinarySearch {
	
	 public static void main(String[] args) {
	        int[] array = { 7, 12, 44, 102, 3, 9, 65, 78, 14, 76, 45 };       
	        System.out.println("Your array is: " + Arrays.toString(array));
	        //theArray must be sorted
	        Arrays.sort(array); 
	         
	        System.out.println("Your sorted array is: " + Arrays.toString(array));
	         
	        //print of the position of the target in a sorted array 
	         
	        System.out.println("The position of the target  in the sorted array:  "+ recursiveBinarySearch(array, 50));
	         
	    }
	     
	 
	public static int recursiveBinarySearch(int[] Array , int key) {
		int low = 0;
		int high = Array.length - 1;
		return recursiveBinarySearch(Array, key , low, high);
	}
	
	public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		if (low > high)
			return low - 1;
		
		int mid = (low + high) / 2;
		if (key < list[mid])
			return recursiveBinarySearch(list , key , low , mid - 1);
		else if (key == list[mid])
			return mid;
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
		
	}
	
}
