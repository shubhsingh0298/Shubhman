package Array;

public class countEvenNumber {
	public static void main(String[] args) {
		
		int arr[] = {10,5,2,3,9,6};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even numbers :"+arr[i]);
				count++;
			}
		}
		
		System.out.println("No. of even count is "+count);
	}

}
