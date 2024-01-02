package Collection;
import java.util.*;
public class Convert_Array_To_Collection {

	public static void main(String[] args) {
		//creating sample array
		String sample_array[] = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday","Sunday"};
		int length_array = sample_array.length;
		
		System.out.println("The input elements are as follows: ");
		
		for(int i=0;i<length_array;i++) {
			System.out.println(sample_array[i]+ " ");
		}
		
		//Converting the array to a List
		List converted_list = Arrays.asList(sample_array);
		
		System.out.println("The converted list is as follows: "+converted_list);
		
	}

}
