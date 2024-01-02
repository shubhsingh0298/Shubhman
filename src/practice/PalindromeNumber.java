package practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int n= sc.nextInt();
		
		int rev=0;
		int lastDigit;
		int original=n;
		
		while(n>0) {
			lastDigit = n%10;
			rev=rev*10+lastDigit;
			n=n/10;
			
		}
		
		if(rev==original) {
			System.out.println("Palindrome number");
		}
		else
			System.out.println("Given not is not Palindrome number");
	}

}
