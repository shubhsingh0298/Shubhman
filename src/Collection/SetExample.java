package Collection;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {

//create hashset implementation using set

		Set<String> veg= new HashSet<String>();
		veg.add("Ginger");
		veg.add("Chilli");
		veg.add("Samosa");
		veg.add("Chaap");
		veg.add("Ginger");
		
		System.out.println("Veg items are :"+veg);
	}

}
