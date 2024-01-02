package practice;

public class duplicateString {

	public static void main(String[] args) {

		String s="Shubham Singh";
		
		char[] c=s.toCharArray();
		
		System.out.println("The string is "+s);
		
		System.out.println("Duplicates character in above string :");
		
		for(int i =0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				
				if(c[i]==c[j]) {
					System.out.println(c[j]+ " ");
					break;
					
				}
			}
		}
		
	}

}
