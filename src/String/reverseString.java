package String;

public class reverseString {

	public static void main(String[] args) {
		
		String str ="HelloJava";
		String rev=" ";
		char ch ;
		
		for(int i =0; i<str.length();i++)
		{
		ch=str.charAt(i);
		System.out.print(ch);
		rev= ch+rev;
		
		
		}
		System.out.println(); 
	 System.out.print("Reverse string : " +rev);
		
		}

}
