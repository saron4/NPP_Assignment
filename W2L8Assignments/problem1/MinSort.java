package W2L8Assignments.problem1;

import java.util.Arrays;

public class MinSort {
	String[] arr;
	MinSort(String[] arr){
		this.arr = arr;
	}
	
	void sort() {
		String temp = "";
		for(int i=0 ; i < arr.length; ++i) {
			for (int k = 0 ; k < arr.length; k++) {
				if (arr[i].compareTo(arr[k]) < 1) {
					temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void maiin(String[] args) {
		String[] test = {"a", "v","b"};
		MinSort sort = new MinSort(test);
		sort.sort();
		System.out.println( Arrays.toString(sort.arr));
	}
	
	}