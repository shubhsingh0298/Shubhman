package Array.character;

public class printASCIValue {

	public static void main(String[] args) {
// WAP to print all characters in an array with its ASCII values and add serial no. to each line
		
		char arr[]= {'N','O',2,6,' ',5,'o','u','n','d'};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+" "+arr[i]+" "+(int)arr[i]);
		}
	}

}
