package Array;

public class productOfTwoDigitNumber {

	public static void main(String[] args) {

		int arr[]= {11,44,99,00};
		int product=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>9 && arr[i]<100) {
				product = product* arr[i];
				System.out.println("Product of Two digit numbers are: ");
				System.out.println(product);
			}
		}
			
	}

}
