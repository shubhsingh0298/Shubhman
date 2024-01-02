package programs;

import java.util.Scanner;

public class armstrongNumber1 {
	
	//153= 1^3 +5^3 +3^3

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit: ");
		int n=sc.nextInt();
		int backUp=n;
		int sum =0;
		 while(n>0) {
			
			 sum = sum +(n%10)*(n%10)*(n%10);
			 n=n/10;
			 
		 }
		 System.out.println(sum);
		 System.out.println(n);
		if(sum==backUp) {
			System.out.println("Armstrong number");
	}
		else
			System.out.println("Not Armstrong number");
	}

}
