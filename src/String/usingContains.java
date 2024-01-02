package String;

public class usingContains {

	public static void main(String[] args) {

		String arr[]= {"THIS","ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY","THEM","THE"};

		String s=" ";
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains("ING")) {
				System.out.println(arr[i]);
			}
		}
	}

}
