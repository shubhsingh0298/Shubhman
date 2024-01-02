package Array;

import java.util.Scanner;

public class ToDeleteSpecificIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		System.out.println("Enter element of an array");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter index number of element you want to delete");
		int element= sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			{
					arr[i]=arr[i+1];
				}
				n--;
				
			}
			
			
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");

		}
	}

}
