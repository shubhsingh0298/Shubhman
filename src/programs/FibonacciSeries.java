package programs;

public class FibonacciSeries { 
	//The first two numbers start with 0 & 1 and next number is the sum of previous two numbers

	public static void main(String[] args) {


		int num1=0, num2=1,num3;
		int count =20;
		
		for(int i =0;i<count;i++) {
			num3= num1+num2;
			System.out.println(num3 + " ");
			
			num1=num2;//num2 assigned to num1
			num2= num3; //num3 assigned to num2
		}
		

	}

}
