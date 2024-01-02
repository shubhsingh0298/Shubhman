package methods;

import java.util.Scanner;

public class numberOfDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a digit: ");
	int num = sc.nextInt();
	countDigits(num);
	
	}
	
	public static void countDigits(int n)
	{

		int count =0;
		while(n>0)
		{
			count++;
			n=n/10;
		
		}
		System.out.println("Total digits are: "+count);
}
}
