package DSA;

public class quickSort {

	public static void main(String[] args) {
			
		int arr[] = {8,3,5,4,2,9};
		printArr(arr);
		System.out.println();
		quickSort(arr, 0, arr.length-1);
		printArr(arr);


	}

	static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}
	
	static void quickSort(int arr[], int s, int e) {
		
		if(s>=e) {
			return;
		}
		
		int mid = partition(arr, s, e);
		
		quickSort(arr, s, mid-1);
		quickSort(arr, mid+1, e);
		
	}
	
	static int partition(int arr[], int s, int e) {
		
		int mid=s;
		int pivot = arr[mid];
		int count=0;
		for(int i=s; i<=e; i++) {
			if(arr[i]<pivot) {
				count++;
			}
		}
		int temp = arr[s+count];  // it is not count but s+count
		arr[s+count] = arr[mid];
		arr[mid] = temp;
		
		mid = s+count;  // same as above
		
		int i=s, j=e; 
		while(i<mid && j>mid) {
			if(arr[i]>pivot && arr[j]<pivot) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			}
			else if(arr[i]>pivot && arr[j]>pivot) {
				j--;
			}
			else if(arr[i]<pivot && arr[j]<pivot) {
				i++;
			}
			else {
				i++;
				j--;
			}
			
		}
		
		return mid;
	}
}
