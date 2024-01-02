package practice;

import java.util.Scanner;

public class divisibleBy3_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=sc.nextInt();
		
		 if(n%3==0 && n%5==0) {
			System.out.println("Hi and Hello");
		}
		
		 else if(n%3==0) {
			System.out.println("Hi");
		}
		
		
	
		
		else if(n%5==0) {
			System.out.println("Hello");
			
		}
	
		else
			System.out.println("The given number is not divisible by 3 & 5");
		
		
	}

}
