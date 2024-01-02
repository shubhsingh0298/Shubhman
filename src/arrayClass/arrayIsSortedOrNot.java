package arrayClass;

public class arrayIsSortedOrNot {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,5,4,6,7};
		System.out.println(isSorted(arr));
	}

		static boolean isSorted(int[] arr) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) {
					return false;
					
				}
			}
			return true;
							
			
		}

	}

