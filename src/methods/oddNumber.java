package methods;

import java.util.Scanner;

public class oddNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int n =sc.nextInt();
		//odd(n);
		
	}
	public static void odd(int n) {

		for(int i =0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println("odd number");
			}
			else
				System.out.println("not odd number");
		}
	}

}
