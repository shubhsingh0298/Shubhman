package programs;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to get reverse of it: ");
		int num = sc.nextInt();
		int lastDigit;
		int rev=0;
		
		while(num>0)
		{
		
		//take lastDigit out from it
		lastDigit= num%10;
		//store it into a variable as reverse
		rev = rev*10+lastDigit;
		//eliminate the lastdigit
		num = num/10;
		}
		
		System.out.println(rev);

	}

}
