package programs;

public class ArmstrongNumber {
//It the sum of cubes of the digits of any number is equal to the number itself then it is Armstrong number.
	public static void main(String[] args) {
	int num =407;
	int original = num;
	int temp;
	int Armstrong =0;
	
	while(num>0) {
		
		temp= num%10;
		temp= (int) Math.pow(temp, 3);
		Armstrong = Armstrong + temp;
		num= num/10;
		
		
	}
	if(Armstrong==original) {
		System.out.println("It is an Armstrong number");
	}
	else
		System.out.println("It is not an Armstrong number");
		

	}

}
