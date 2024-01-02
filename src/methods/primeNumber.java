package methods;

import java.util.Scanner;

//Natural number>1
//And which has only two factors : 1 & itself
public class primeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit:");
		int n = sc.nextInt();
		prime(n);

	}
	public static void prime(int n) {
		int count=0;
		
		for(int i =1;i<=n;i++) {
			if(n%i==0)
			count++;
		}
			if(count==2) {
				System.out.println("Prime Number");
		}
			else
				System.out.println("Not a prime number");
	}

}
