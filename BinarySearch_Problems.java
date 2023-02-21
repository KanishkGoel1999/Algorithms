package DSA;

public class BinarySearch_Problems {

	public static void main(String[] args) {
		
		int arr[] = {7,9,1,2,3};
		int brr[] = {3,8,10,17,1};
	//	System.out.println(pivot(arr));
	//	System.out.println(pivot(brr));
		
		System.out.println(findKey(arr, 2));

	}
	
	// can be used for searching in a sorted rotated array
	
	static int pivot(int arr[]) {
		
		int s = 0, e = arr.length-1, mid = (s+e)/2;
		while(s<e) {
			if(arr[s]<=arr[mid]) {
				s=mid+1;
			}
			else {
				e=mid; // ?? 
			}
			
			mid =(s+e)/2;
		}
		
		
		return s;
	}
	
	static int findKey(int arr[], int key) {
		
		int p = pivot(arr);
		System.out.println(p);
		int e = arr.length-1;
		int s = 0;
		if(arr[p]<= key && key<=arr[e]) {
			return binarySearch(arr, key, p, e);
		}
		else {
			return binarySearch(arr, key, s, p-1);
		}
		
		
	}

	
	static int binarySearch(int arr[], int n, int start, int end) {
			
			int mid;
			mid = arr.length/2;
		
			
			while(start<end) {
				
				if(n>arr[mid]) {
					start = mid+1;
				}
				else if(n==arr[mid]) {
					return mid;
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
