package Array;

public class productofPositiveNumber {

	public static void main(String[] args) {

		int arr[]= {8,-9,-4,6,32};
		int product=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				product=product*arr[i];
				System.out.println("Product of Positive numbers are "+product);
			}
		}
	}

}
