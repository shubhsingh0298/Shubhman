package assignment.abstraction;

import java.util.Scanner;

public class BankController {

	public static void main(String[] args) {
	

		System.out.println("Press 1 for ICICI");
		System.out.println("Press 2 for HDFC");
		System.out.println("Press 3 for IDFC");

	    Scanner sc = new Scanner(System.in);
	    int input =sc.nextInt();
	    RBI bank=null;
	    
	    
	    if(input==1)
	    {
	    	ICICI obj=new ICICI(289087,2345);
	    	System.out.println("Initial balance: " + obj.getBalance());
	    	obj.withdraw(8000);
	    	obj.deposit(9000);
	    	System.out.println("Final balance: " + obj.getBalance());
	    	
	    }
	    else if(input==2)
	    {
	    	HDFC obj=new HDFC(67834,254);
	    	System.out.println("Initial balance: " + obj.getBalance());
	    	obj.withdraw(600);
	    	obj.deposit(900);
	    	System.out.println("Final balance: " + obj.getBalance());
	    	
	    	
	    }
	    else if(input==3)
	    {

	  
	    	IDFC obj=new IDFC(10384,20235);
	    	System.out.println("Initial balance: " + obj.getBalance());
	    	obj.withdraw(600);
	    	obj.deposit(8130);
	    	 System.out.println("Final balance: " + obj.getBalance());

	    }
	    
	    else if(input==0)
	    {
	    	System.out.println("Exit");
	    }
	    else
	    {
	    	System.out.println("Select any option");
	    }
	    
	    
	}
	}


