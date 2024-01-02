package practice;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {

		int n=10;
		int sum=0;

		while(n>0) {
			sum=sum+n;
			n--;
		}
		//sum=(n*(n+1)/2);
		System.out.println(sum);
	}

}
