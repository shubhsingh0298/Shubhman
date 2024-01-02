package Array;

public class PrimeElement {
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i =2;i<n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;

	}
	public static void main(String[] args) {
		  int[] arr = {10,11,29,40,56,3};
		  
		  for(int i=0;i<arr.length;i++) {
			  if(isPrime(arr[i]))
			  {
				  System.out.println(arr[i]);
			  }
		  }
	}
}
