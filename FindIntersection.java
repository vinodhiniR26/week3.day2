package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int myArray1[] = {3,2,11,4,6,7};
		int myArray2[]  = {1,2,8,4,9,7};
		for(int i = 0;i<myArray1.length;i++) {
			for(int j=0;j<myArray2.length;j++) {
				if(myArray1[i]==myArray2[j]) {
					System.out.println(myArray2[j]);
				}
			}
		}

	}

}
