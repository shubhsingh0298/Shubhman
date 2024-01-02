package Project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double first =sc.nextDouble();
		double second =sc.nextDouble();
		
		System.out.println("Enter any operator(+,-,*,/):");
		char ch=sc.next().charAt(0);
		double result ;
		
		switch(ch) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first=second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		default: 
			System.out.println("Invalid operator");
			return;

		}
		System.out.println(result);
		
			}

}
