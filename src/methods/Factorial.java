package methods;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Main starts");
		findFactorial(12);
		findFactorial(6);
		findFactorial(8);
		System.out.println("Main ends");

	}
	
	public static void findFactorial(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(n +"! =" + fact);
	}

}
