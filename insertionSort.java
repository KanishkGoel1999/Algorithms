package DSA;

public class insertionSort {

	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3,8,6};
		
		for(int i=1; i<arr.length; i++) {
			
			for(int j=0; j<arr.length ;j++) {
				if(arr[i]<arr[j]) {
					//swap(arr[i], arr[j]);
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else {
					break;
				}
				
			}
		}
		
		print(arr);

	}
	
	static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a=b;
		b= temp;
	}

	
}
