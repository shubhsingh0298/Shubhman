package programs;

public class palindromeNumber {

	public static void main(String[] args) {
	
		int num =121;
		int originalnum=num; //here we have stored num into original variable because after
		          //reverse of num it gets 0 thats why we have 
		         //to have to take a container as originalnum to stroe original num
		         // to compare with reverse i.e rev for checking whether given number is palindrome or not.
		int rev=0;
		int lastdigit;
		
		while(num!=0) {

			//take lastDigit out from it
			lastdigit= num%10;
			//store it into a variable as reverse
			rev = rev*10+lastdigit;
			//eliminate the lastdigit
			num = num/10;
			}
		System.out.println(num);// everytime num gets 0
		System.out.println(rev);
		if(originalnum==rev) {
			System.out.println("It is a palindrome number");
		}
		else
			System.out.println("It is not a palindrome number");

	}

}
