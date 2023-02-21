package DSA;
import java.util.Arrays;

public class bookAllocation_Problem {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		System.out.println(allocateBooks(arr, 2));

	}
	
	static int allocateBooks(int arr[], int  st) {
		int s=0;
		int e=0;
		for(int i=0; i<arr.length; i++) {
			e = e + arr[i];
		}
		
		int mid = (s+e)/2;
		int ans=0;
		while(s<=e) {
			if(isValid(arr, mid, st)) {
				ans=mid;
				e=mid-1;
			}
			else {
				s = mid+1;
			}
			mid = (s+e)/2;
		}
		return ans;
	}
	
	static boolean isValid(int arr[],int sum, int st) {
		
		int pageSum = 0;
		int stCount = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			if(pageSum + arr[i] <= sum) {
				pageSum = pageSum + arr[i];
			}
			else {
				stCount++;
				if(stCount>st || arr[i]>sum) {
					return false;
				}
				pageSum = arr[i];
				
			}
			
		}
		
			return true;
		
	}
	
	
	}

}
