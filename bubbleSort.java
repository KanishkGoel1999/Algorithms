package DSA;

public class bubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {8,3,5,4,2,9};
		boolean swapped = false;
		
		for(int i=0; i<arr.length; i++) {
			
			
			int j=0;
			while(j<arr.length-1-i) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				j++;
			}
			if(!swapped) {
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
