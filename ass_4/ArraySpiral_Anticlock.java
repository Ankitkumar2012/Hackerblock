package ass_4;

import java.util.Scanner;

public class ArraySpiral_Anticlock {
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
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int count=0;
		while(count<total) {
			for(int i=minr; i<=maxr && count<total; i++) {
				System.out.print(arr[i][minc]+",");
				count++;
			}
			minc++;
			for(int i=minc; i<=maxc && count<total; i++) {
				System.out.print(arr[maxr][i]+",");
				count++;
			}
			maxr--;
			for(int i=maxr; i>=minr && count<total; i--) {
				System.out.print(arr[i][maxc]+",");
				count++;
			}
			maxc--;
			for(int i=maxc; i>=minc && count<total; i--) {
				System.out.print(arr[minr][i]+",");
				count++;
			}
			minr++;
		}
		
	}

}
