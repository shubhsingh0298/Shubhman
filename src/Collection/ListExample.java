package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	
		//create list 
		List<String> names = new ArrayList<String>();
		
		names.add("Adele");
		names.add("Emma");
		names.add("Aria");
		names.add("Ally");
		names.add("Emma");
		names.get(2);
		System.out.println("Names are:");
	//performing iteration of list to print each elements of it
	for(String name:names) {
			System.out.println(name);
	}
	}

}
