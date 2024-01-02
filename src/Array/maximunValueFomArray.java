package Array;
//USe userDefineArray method : to create and store the values & find out maximun value from the array
public class maximunValueFomArray {

	public static void main(String[] args) {
		int[] arr = {10,11,29,40,56,3};
       int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>max)	{
			max=arr[i];
		}
		}
		System.out.println("MAX no. is :"+max);
		}

}
