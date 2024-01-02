package arrayClass;

public class linearSearch {
public static int linearSearch(int[] arr, int element)
{
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
			return i;
		}
	}
	return -1;
	
	
}
	
	

	public static void main(String[] args) {
	int arr[] = {2,7,9,21,44,78};
	System.out.println(linearSearch(arr,7));

	

	}


	
}
