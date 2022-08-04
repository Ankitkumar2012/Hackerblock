package ass_4;

import java.util.Scanner;

public class Rotate_image {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [][]arr=new int [n][n];
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length; j++) {
				arr[i][j] =ak.nextInt();
			}
		}
	//	int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		ans(arr);
	}

	private static void ans(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<=arr.length-1; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}

}
