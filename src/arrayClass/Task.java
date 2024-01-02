package arrayClass;

import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Original List:"+ Arrays.toString(arr));
		//int flag=0;
		for(int j=0;j<arr.length;j++)
		
			
		{
			//logic for sort an element
			boolean isSwap=false;
			for(int i=0;i<arr.length-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					//swap
					int temp= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					isSwap=true;
					//flag=1;
				}
			}
			//if(flag==0) {
			if(isSwap==false) {

			System.out.println("Loop not executed");
				break;
		}
		
		}
		System.out.println("Task List: "+ Arrays.toString(arr));
	}

}
