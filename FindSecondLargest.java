package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		int[] data = {3,2,11,4,6,7};
		int size = data.length;
		Arrays.sort(data); 
		System.out.println("Sorted Arrays are: "+ Arrays.toString(data));
		int res = data[size-2];	
		System.out.println("Second Largest Number:"+res);
		
	

	}

}
