package programs;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any primeNumber :");
	
	    int num = sc.nextInt();
	    
	    
	    
	    boolean prime= true;
	    
	    for(int i=2;i<num;i++) {
	    	if(num%i==0) {
	    		prime= false;
	    		break;
	    	}
	    }
	    System.out.println(prime);
		
	}
}
