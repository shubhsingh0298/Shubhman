package Array;

public class divisibleBy3_5 {

	public static void main(String[] args) {
		
		int[] arr = {10,11,29,40,56,3};
		
		System.out.println("Elements divisible by both 3 and 5 in the array:");
		

		for(int i =0;i<arr.length;i++) {
			if(arr[i] % 3==0 && arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}

	}

}


