package Recursion;

import java.util.Scanner;

public class printEvenNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	printEven(num);

	}
   public static void  printEven(int n) {
	   if(n>0) {
		   int rem = n%10;
		   if(rem%2==0) {
			   System.out.println(rem);
		   }
		   printEven(n/10);
		}
   }
}
