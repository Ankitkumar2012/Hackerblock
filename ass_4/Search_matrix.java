package ass_4;

import java.util.Scanner;

public class Search_matrix {
	public static void main(String[] args) {
		Scanner ak = new Scanner(System.in);
		int n = ak.nextInt();
		int m = ak.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = ak.nextInt();
			}
		}
		int t=ak.nextInt();
		System.out.println(ans(arr,t));
	}

	private static int ans(int[][] arr,int t) {
		// TODO Auto-generated method stub
	      int row=0;
	      int col=arr[0].length-1;
		while(row<arr.length && col>=0){
			if(arr[row][col] == t) {
				return 1;
			}else if(arr[row][col] <t) {
				row++;
			}else {
				col--;
			}
		}
		return 0;
		
	}

}
