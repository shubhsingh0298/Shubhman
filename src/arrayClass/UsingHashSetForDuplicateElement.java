package arrayClass;

import java.util.HashSet;

public class UsingHashSetForDuplicateElement {

	public static void main(String[] args) {
		String s[]= {"java","C","Python","java","C++","java"};
		
		boolean flag=false;
		
		HashSet <String>str=new HashSet();
		
		for(String l:s) {
			if(str.add(l)==false) {
				System.out.println("Found duplicate element :"+ l);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Not foud duplicate element");
		}
	}

}
