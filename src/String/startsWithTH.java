package String;

public class startsWithTH {

	public static void main(String[] args) {

		String arr[]= {"THIS","ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY","THEM","THE"};

		String s=" ";
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].startsWith("TH")) {
				System.out.println("Starts with TH :"+" "+arr[i]);
			}
		}
	}

}
