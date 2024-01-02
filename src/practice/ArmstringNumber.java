package practice;

import java.util.Scanner;

public class ArmstringNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
	
		double temp;
		double sum=0;
		double original =n;
		
		while(n>0) {
			temp=n%10;
			temp=Math.pow(temp,3);
			sum=sum+temp;
			n=n/10;
		}
		if(original ==sum) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not an armstrong number");
	}

}
