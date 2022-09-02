package ass_6;

import java.util.Scanner;

public class Tower_of_hanoi {
	static int count=0;
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		String tower="T1";
		String dest="T2";
		String help="T3";
		System.out.println(ans(n,tower,dest,help));
	}

	private static int ans(int n, String tower, String dest, String help) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return 0;
		}
		ans(n-1,tower,help,dest);
		count++;
		System.out.println("Move "+n+"th disc from "+tower+" to "+dest);
		ans(n-1,help,dest,tower);
		return count;
		
	}

}
