package DSA;

public class mergeSort {
	
	//HW :Inversion Count
	//	  TC?
	//	  Applications

	public static void main(String[] args) {
		
		int arr[] = {8,3,5,4,2,9};
		printArr(arr);
		System.out.println();
		mergeSort(arr, 0, arr.length-1);
		printArr(arr);

	}
	
	static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}
	
	static void mergeSort(int arr[], int s, int e) {
		if(s>=e) {
			return;
		}
		int mid = (s+e)/2;
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);
		
		merge(arr, s, e);
	}
	
	static void merge(int arr[], int s, int e) {
		int mid = (s+e)/2;
		
		int lOne = mid-s+1;
		int lTwo = e-mid;
		
		int brr[] = new int[lOne];
		int crr[] = new int[lTwo];
		int mainIndex =s;
		for(int i=0; i<lOne; i++) {
			brr[i] = arr[mainIndex++];
		}
		
		for(int i=0; i<lTwo; i++) {
			crr[i] = arr[mainIndex++]; //
		}
		
		//mergeSortedArray(brr, crr, arr);
		int i=0, j=0;
		mainIndex = s;
		while(i<lOne && j<lTwo) {
			if(brr[i]<=crr[j]) {
				arr[mainIndex] = brr[i];
				i++;
				mainIndex++;
			}
			else {
				arr[mainIndex] = crr[j];
				j++;
				mainIndex++;
			}
			
		}
		while(i<lOne) {
			arr[mainIndex] = brr[i];
			i++;
			mainIndex++;
		}
		while(j<lTwo) {
			arr[mainIndex] = crr[j];
			j++;
			mainIndex++;
		}
			
	}
	
}
