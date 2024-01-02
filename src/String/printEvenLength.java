package String;

public class printEvenLength {
//take a string array and print all string which have even length
	public static void main(String[] args) {
	String arr[]= {"THIS","ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY"};
	
	String s=" ";
	System.out.println("Even length of string :");

	for(int i =0;i<arr.length;i++)
	{
		if(arr[i].length()%2==0) {
			System.out.println(arr[i]);
		}
	}
	
	}

}
