package Array;

import java.util.Scanner;

public class sumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size= sc.nextInt();
		
		int[] arr= new int[size];
		System.out.println("Enter " + size + " element of an array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum= sum+arr[i];
		
		}
		System.out.println("Sum of an array is : "+sum);
	}

}
