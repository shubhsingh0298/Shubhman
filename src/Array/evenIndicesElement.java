package Array;

public class evenIndicesElement {

	public static void main(String[] args) {

    int[] arr = {10,11,29,40,56,3};
    
    System.out.println("Even indices elements are: ");
    
    for(int index=0;index<arr.length;index++) {
    if(index%2==0) {
    	System.out.println(index);
    }
    
    
    }

	}

}
