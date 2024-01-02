package Array;

import java.util.Scanner;

//Q. Wajp to desgin a method that can create an array of integer type a/c to the user defined size.
public class userDefineArray {
	//create an array object for user define
	public static int[] createArray(int size){
		
	return new int[size];
	}

	
	//INSERT data in an int array of user defined...
	public static int[] insertUserDefinedData(int[] arr) {
		

	Scanner sc = new Scanner(System.in);
	for(int i =0;i<arr.length;i++) {
		System.out.println("Enter the element at " + i + "th index : ");
		arr[i] =sc.nextInt();
	}
	return arr;
	}
	
	//method to display all the elements of int array
	public static void display(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			
		}
	}
	public static void main(String[] args) {
	

	}

}
