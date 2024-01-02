package arrayClass;

public class RemoveDuplicateElementFromSortedArray {
	
	static void removeDuplicate(int n[]) {
		int rd=0;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[rd]!=n[i]) {
					rd++;
					n[rd]=n[i];
				}
			}
		}
	}
					
public static void main(String[] args) {
	
	int arr[]= {2,2,4,6,6,8,8,10};
	removeDuplicate(arr);
	for(int i=0;i<arr.length;i++) {
	
	
	System.	out.println("Remove Duplicate element :"+ arr[i]);
	}

	
			
		
	
}
}
