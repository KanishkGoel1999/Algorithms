package DSA;

public class ArrayProblems {

	public static void main(String[] args) {
		int arr[] = {2,4,6};
		//reverse(arr);
		print(arr);
		System.out.println();
		int brr[] = {1,3,5,7,9};
		print(brr);
		System.out.println();
		mergeSortedArray(arr,brr);


	}
	
	static void reverse(int arr[]) {
		
		int s=0, e= arr.length-1;
		
		while(s<=e) {
			//swap(arr[s], arr[e]);
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void mergeSortedArray(int arr[], int brr[]) {
		int p=0, q=0;
		int crr[] = new int[arr.length+brr.length];
		int index=0;
		while(p<arr.length && q<brr.length) {
			if(arr[p]<=brr[q]) {
				crr[index] = arr[p];
				p++;
				index++;
			}
			else {
				crr[index] = brr[q];
				q++;
				index++;
			}
		}
		
		while(p<arr.length) {
			crr[index] = arr[p];
			p++;
			index++;
		}
		
		while(q<brr.length) {
			crr[index] = brr[q];
			q++;
			index++;
		}
		
		print(crr);
	}
	
	

}
