package Array;
//From the above user defined array a method should display first max,second max & third max.
public class display123MaxArray {

	public static void main(String[] args) {
		
		int[] arr = {10,11,29,40,56,3};
		int max1=arr[0];
		int max2=arr[0];
		int max3=arr[0];

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1)
			{
				max2=max1;
				max1= arr[i];
				
			}
			else if(arr[i]>max2) {
				max3=max2;
				max2=arr[i];
			}
			else if(arr[i]>max3) {
				max3=arr[i];
				max3=arr[i];
			}
			
		}
		System.out.println("1st max number:"+max1);
		System.out.println("2nd max number:"+max2);
		System.out.println("3rd max number:"+max3);



	}

}
