package String;

public class countUpperCase {

	public static void main(String[] args) {
		String s= "I Am The Best";
		
		int count =0;
		
		for(char c:s.toCharArray()) {
		if(Character.isUpperCase(c)) {
			count++;
		}
		
	}
		System.out.println(count);

}
}
