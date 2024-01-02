package Array;

public class countThreeDigitNumber {

	public static void main(String[] args) {
		
		int arr[]= {234,5555,66,43,222};
		int count=0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>99 &&arr[i]<1000) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("Count of 3-digits number:"+count);

	}

}
