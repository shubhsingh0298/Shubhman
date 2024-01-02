package Recursion;

import java.util.Scanner;

public class printEachDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		printNum(n);
		
	}
	public static void printNum(int n) {
		if(n>0)
		{
			int rem = n%10;
			System.out.println(rem);
			printNum(n/10);
			
		}
		else
			System.out.println("Recursion completed");
	}

}
