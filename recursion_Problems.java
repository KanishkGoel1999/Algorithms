package DSA;

import java.util.Arrays;

public class recursion_Problems {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,6}; 
		int brr[] = {1,3,5,7,9};
		int crr[] = {4,12,8,6, 34,23};
		int key =3;
		System.out.println(isSorted(arr, arr.length));
		System.out.println(sumArray(brr,brr.length));
		//System.out.println(linearSearch(crr, crr.length,8 ));
		Arrays.sort(crr);
		System.out.println(binarySearch(crr, key, 0, crr.length-1));
	}
	
	static boolean isSorted(int arr[], int n) {
		
		if(n==1 || n==0) {
			return true;
		}
		if(arr[n-1]<arr[n-2]) {
			return false;
		}
		else {
			boolean ans = isSorted(arr, n-1);
			return ans;
		}
	}
	
	static int sumArray(int arr[], int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return arr[n-1];
		}
		else {
			int sum = arr[n-1]+ sumArray(arr,n-1);
			return sum;
		}
		
	}
	
	static boolean linearSearch(int arr[], int n, int key) {
		System.out.println("size of array is "+n);
		if(n==0) {
			return false;
		}
		else if(arr[n-1]==key) {
			return true;
		}
		else {
			return linearSearch(arr, n-1, key);
		}
	}
	
	static boolean binarySearch(int arr[], int key, int s, int e) {
		System.out.println("size of array is "+ s + " and "+ e);
		int mid=(s+e)/2;
		
		if(arr[mid]==key) {
			return true; 	
		}
		else if(e<s) {
			return false;
		}
		
		else if(arr[mid]>key) {
			return binarySearch(arr, key, s, mid-1);
		}
		else {
			return binarySearch(arr, key, mid+1, e);
		}
	}

}
