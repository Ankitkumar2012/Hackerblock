package ass_6;

import java.util.Scanner;

public class Maze_path {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();  
		int m=ak.nextInt();
//		int n=3,m=3;
		System.out.println("\n"+ans(n,m,""));
	}
	private static int ans(int n, int m, String ans) {
		// TODO Auto-generated method stub
		if(n==1 && m==1) {
			System.out.print(ans+" ");
			return 1;
		}
		if(n<=0 || m<=0) {
			return 0;
		}
		int f1=ans(n-1,m,ans+"V");
		int f2=ans(n,m-1,ans+"H");
		return f1+f2;
	}
}
