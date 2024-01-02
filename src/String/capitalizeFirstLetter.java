package String;

public class capitalizeFirstLetter {
public static void main(String[] args) {
	String arr[]= {"new","keyword","swift","quick","limca"};
	
	for(int i=0;i<arr.length;i++) {
		char F=arr[i].charAt(0);
	  Character.isUpperCase(F);
		String E= arr[i].substring(1);
		System.out.println(F+E);
	}
}
}
