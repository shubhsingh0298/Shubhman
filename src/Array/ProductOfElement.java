package Array;

public class ProductOfElement {

	public static void main(String[] args) {
		int product=1;
		int[] arr= {10,11,29,40,56,3};
		
		System.out.println("Product of given numbers are: ");
		
		for(int i=0;i<arr.length;i++) {
			product= product*arr[i];
			
			System.out.println(product);
		}
	}

}
