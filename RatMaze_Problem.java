package DSA;
import java.util.*;

public class RatMaze_Problem {
	
	public static void main(String[] args) {
		ArrayList<String> brr = new ArrayList<String>(1);
		
		
		int arr[][] = {{1,0,0,0},
					   {1,1,0,1},
					   {1,1,0,0},
					   {0,1,1,1}};
		
		int visited[][] = {{0,0,0,0},
						   {0,0,0,0},
						   {0,0,0,0},
						   {0,0,0,0}};
		String path = "";
		getRoute(brr, arr, 0,0, path, visited);
		
		for(int i=0; i<brr.size(); i++) {
			System.out.println(brr.get(i));
		}
		
	}
	
	//static char ans[] findPath(int arr, )
		
	
	static boolean isSafe(int arr[][], int x, int y, int visited[][]) {
		int row = arr.length;
		int col = arr[0].length;
		
		if(x<row && x>=0 && y>=0 && y<col && arr[x][y] ==1 && visited[x][y]==0) {
			return true;
		}
		else {
			return false;
		}
	}

	
	static void getRoute(ArrayList<String> brr, int arr[][], int r, int c, String path, int visited[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		
		if(r==row-1 && c==col-1) {
			brr.add(path);
			return ;
		}
		
		String temp = path;
		visited[r][c] = 1;
		//Up
		int x = r-1;
		int y = c;
		if(isSafe(arr, x, y, visited)) {
			path = path + 'U';
			getRoute(brr, arr, x, y, path, visited);
			path = temp; // important
		}
		
		//Down
		x = r+1;
		y = c;
		if(isSafe(arr, x, y, visited)) {
			path = path + 'D';
			getRoute(brr, arr, x, y, path, visited);
			path = temp;
		}
		
		//Right
		x = r;
		y = c+1;
		if(isSafe(arr, x, y, visited)) {
			path = path + 'R';
			getRoute(brr, arr, x, y, path, visited);
			path = temp;
			
		}
		
		//Left
		x = r;
		y= c-1;
		if(isSafe(arr, x, y, visited)) {
			path = path + 'L';
			getRoute(brr, arr, x, y, path, visited);
			path = temp;
			
		}
		
		
		
		visited[r][c] = 0;
		
	}

}
