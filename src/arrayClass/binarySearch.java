package arrayClass;

public class binarySearch {
	public static int binarySearch(int[] arr, int element) {
		int s=0;
		int end =arr.length;
		while(s<end)
		{
			int mid =(s+end)/2;
			if(element==arr[mid])
			{
				return mid;
			}
			else if(element<arr[mid]) {
				end=mid-1;
				
			}
			else if(element>arr[mid]) {
				s=mid+1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {12,45,67,89,93,103,145};
		System.out.println(binarySearch(arr,89));
		
	}

}
