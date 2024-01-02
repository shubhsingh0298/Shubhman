package Array;

public class oddElement {

	public static void main(String[] args) {
		
		int[] arr = {10,11,29,40,56,3};
		
		System.out.println("Following numbers are odd elements:");
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
				
			}
		}
	}

}
