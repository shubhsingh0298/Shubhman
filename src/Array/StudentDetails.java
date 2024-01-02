package Array;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int number;
	System.out.println("Enter total subject :");
	number= sc.nextInt();
	
	String subject;
	System.out.println("Enter subject name: ");
	//subject= charAt()
	
	
	
	int[] size =new int[number];
	System.out.println("Enter marks of each subjects: ");
	
	for(int i =0;i<number;i++) {
		
		size[i]=sc.nextInt();
		
	}
	int total=0;
	for(int i=0;i<number;i++){
		total=total+size[i];
	}
	System.out.println("Total marks obtain :"+total);
	
	double percent;
	percent = total/number;
	System.out.println("Total percentage: "+percent+"%");
}
}