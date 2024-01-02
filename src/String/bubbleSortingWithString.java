package String;

public class bubbleSortingWithString {

	public static void main(String[] args) {
		String s[]= {"orange","apple","banana","guava","dragonfruit"};
		System.out.println("*************Unsorted array************");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+",");
		}
		printBubble(s);
		
	
		System.out.println("\n*************Sorted array******************");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+",");
		}
	}
	static void printBubble(String[] s) {
	
			for(int i=0;i<s.length-1;i++) {
				for(int j=0;j<s.length-i-1;j++) {
					if(s[j].compareTo(s[j+1])>0) {
						
						String t=s[j];
						s[j]=s[j+1];
						s[j+1]=t;
						
					}
				}
			}
		}
	


}
