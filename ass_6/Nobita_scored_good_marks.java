package ass_6;

import java.util.Scanner;

public class Nobita_scored_good_marks {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int t=ak.nextInt();
		while(t-->0) {
			int a=ak.nextInt();
			int b=ak.nextInt();
			System.out.println(ans(a,b));
		}
//		int a=10;
//		int b=3;
//		System.out.println(ans(a,b));
	}

	private static int ans(int a, int b) {
		// TODO Auto-generated method stub
		int c=a%b;	
		if(c>b/2)return b-c;
		return c;
	}

}
