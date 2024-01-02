package arrayClass;

public class bubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,3,6,2,7,1,5};
		int n=a.length;
		
		System.out.println("Unsorted array");
		for(int i=0;i<n;i++) 
		System.out.print(a[i]+" ");	
		
		//for ascending order
//		for(int i=0;i<n-1;i++)  //for steps(iteration)
//		{
//			for(int j=0;j<n-i-1;j++)//for comparison
//			
//			{
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//			
//		}
		
		
		//**************DESCENDING ORDER**********************
		for(int i=0; i<n-1;i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(a[j]<a[j+1]) {
					int t= a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("\nSorted array");
		for(int i=0;i<n;i++) 
		System.out.print(a[i]+",");	
		

	}

}
