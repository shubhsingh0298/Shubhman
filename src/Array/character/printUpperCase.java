package Array.character;

public class printUpperCase {

	public static void main(String[] args) {

		char ch[]= {'a','U','Q','p','A','c','R',' '};
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				System.out.println("Upper case characters are :"+" "+ch[i]);
			}
			if(Character.isLowerCase(ch[i])) {
				System.out.println("Lower case characters are :"+" "+ch[i]);
		}
	}

	}
}
