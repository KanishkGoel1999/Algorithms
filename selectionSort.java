package DSA;

public class selectionSort {

	public static void main(String[] args) {
		
		int arr[] = {3,5,8,2,1,7};
		
		for(int i=0; i<arr.length; i++) {
			
			int index=i;
			for(int j=i; j<arr.length; j++) {
				if(arr[index]>arr[j]) {
					index = j;
				}
			}
			int t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
