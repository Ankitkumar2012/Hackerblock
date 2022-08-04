package ass_4;

import java.util.Scanner;

public class Wave_rowise {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int m=ak.nextInt();
		int [][] arr=new int [n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = ak.nextInt();
			}
		}
		
		ans(arr);	
		System.out.print("END");
	}

	private static void ans(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row=0; row<arr.length; row++) {
			if(row%2==0) {
				for(int col=0; col<arr[0].length; col++) {
					System.out.print(arr[row][col]+", ");
				}
			}
			else {	
				for(int col=arr[0].length-1; col>=0; col--) {
				System.out.print(arr[row][col]+", ");
			}
		 }
			
     	}
		
	}
}
