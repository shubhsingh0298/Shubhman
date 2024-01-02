package programs;

public class printAtoZwithASCIvalue {

	public static void main(String[] args) {
		
		char ch;
		int i;
		//want to print ascii vale as well
		
		for(ch='A';ch<='Z';ch++) { //here it is incrementing integer value of alphabets 
			i=ch; //here like A is assgined to i but i is of integer type so it will print integer value of A (applicable for all)
			System.out.println(ch +" "+i );
		}
		System.out.println("===========================================");
		for(ch='a';ch<='z';ch++) {
			i= ch;
			System.out.println(ch + " "+i);
		}

	}

}
