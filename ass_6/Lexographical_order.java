package ass_6;

import java.util.Scanner;

public class Lexographical_order {
	public static void main(String[] args) {
//		int n=10;
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		ans(n,0);
	}

	private static void ans(int n,int m) {
		// TODO Auto-generated method stub
		if(m>n) return;
		System.out.print(m+" ");
		int i=0;
		if(m==0) i=1;
		for (;i <=9; i++) {
			ans(n,m*10+i);
		}
	}

}
