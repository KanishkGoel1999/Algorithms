package DSA;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,12,18};
		int  brr[] = {3,8,11,14,16};
		binarySearch(arr, 1);

		
	}
	
	static int binarySearch(int arr[], int n) {
		
		int start, end, mid;
		mid = arr.length/2;
		start = 0;
		end = arr.length-1;
		
		while(start<end) {
			
			if(n>arr[mid]) {
				start = mid+1;
			}
			
			else if(n==arr[mid]) {
				System.out.print("Found");
				return +1;
				
			}
			
			else {
				end = mid-1;
			}
			
			mid = (start + end)/2; // start + (end-start)/2 
		}
		
		
			System.out.print("not found");
			return -1;
		

	}

}
