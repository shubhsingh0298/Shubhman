package practice;

public class primeNumber200to350 {

	public static void main(String[] args) {

		int start=200;
		int end =350;
		int count=0;
		
		for(int i=start;i<=end;i++) {
			
			for(int j=i;j<=i-1;j++) {
				if(i%j==0) {
					count++;
					
				}
				if(count==2) {
					System.out.println(i);
				}
				
			}
		}
		
	}
}
			
	
