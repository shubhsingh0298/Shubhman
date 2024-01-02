package Array;

public class ElementEndWithZero {

	public static void main(String[] args) {
		   int[] arr = {10,11,29,40,56,3};

		 System.out.println("Elements ending with 0:");
      
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%10==0) {
				 System.out.println(arr[i]);
			 }
		 }
	}

}
