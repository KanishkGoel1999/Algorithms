package DSA;

public class spiralPrint_Problem {

	// 2d-arrays
	// print largest row/col sum
	// wave print (use odd//even)
	// spiral print
	
	
	
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		spiralPrint(arr, 4, 3);
		System.out.println();
		int brr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		spiralPrint(brr, 3,4);
		System.out.println();
		System.out.println(binarySearch(arr, 7));
		
		System.out.println();
		System.out.println();
		
		int crr[][] = {{1,4,7,11},
					   {2,5,8,12},
					   {3,6,9,16}};
		
		
		
	}
	
	static void spiralPrint(int arr[][], int rowCnt, int colCnt) {    // sahi karo
		
		
		int r=0, c=0, minR=1, minC=0;
		
		while(rowCnt>0 && colCnt>0) {																
			while(c<colCnt) {
				System.out.print(arr[r][c] + " ");								// 123 
				c++;															// 456
																				// 789
																				// 1 2 3 6 9 8 7 4 5
			}
			colCnt--;
			c--;
			r++;
			while(r<rowCnt) {
				System.out.print(arr[r][c] + " ");
				r++;
			}
			rowCnt--;
			r--;
			c--;
			while(c>=minC) {
				System.out.print(arr[r][c] + " ");
				c--;
			}
			minC++;
			c++;
			r--;
			while(r>=minR) {
				System.out.print(arr[r][c] + " ");
				r--;
			}
			minR++;
			r++;
			c++;
			
		}
	
	}
	
	static boolean binarySearch(int arr[][], int key) {
		int r=arr.length;
		int c=arr[0].length;
		int s=0;
		int e= r*c - 1;
		int mid = (s+e)/2;
		
		//row = mid/c
		//col = mid%c
		
		while(s<=e) {
			int midTerm = arr[mid/c][mid%c];
			if(midTerm == key) {
				return true;
			}
			else if(midTerm > key) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
			mid = (s+e)/2;
			
		}
		int crr[] = {s/c,e};
		
		return false;
			
	}
			
	}

}