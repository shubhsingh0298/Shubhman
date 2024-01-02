package Array;

import java.util.Scanner;

public class ToDeleteSpecificArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an element");
		int size=sc.nextInt(); //Array Size Declaration and Initialization
		System.out.println("Enter element of the array");
		int arr[]=new int[size]; //Array Declaration
		
		for(int i=0;i<size;i++) //Array Initialization
			{
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to delete");
		int element=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element) {//If element found
				
				// shifting elements
				for(int j=i;j<arr.length-1;j++) {
					arr[i]=arr[j+1];
					
				}
				break;
					
				
			}
		}
		System.out.println("Element after deletion");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}


