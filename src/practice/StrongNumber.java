package practice;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get result as strong number:");
		int n=sc.nextInt();
		int sum=0,temp;
		int copy=n;
		
		while(n>0) {
			temp=n%10;
			int x=fact(temp);
			sum=sum+x;
			n=n/10;
		}
		if(copy==sum) {
			System.out.println(copy+" "+"Strong number");
		}
		else
			System.out.println("Not a strong number");
		
	}
			
		
		
		static int  fact(int y) {
			int f=1;
			for(int i=y;i>0;i--) {
				f=f*i;
			}
			return f;

		
		
		
	}

}
