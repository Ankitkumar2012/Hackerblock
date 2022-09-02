package ass_6;

import java.util.Scanner;

public class Board_path {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int a=ak.nextInt();
		int b=ak.nextInt();
//		int a=3;
//		int b=3;
		System.out.println("\n"+ans(a,b,0,""));
	}

	private static int ans(int a, int b,int c,String ans) {
		// TODO Auto-generated method stub
		if(c==a && b<=3) {
			System.out.print(ans+" ");
			return 1;
		}
		if(c>a)return 0;
		int f1=0;
		for(int i=1;i<=b;i++) {
		f1+=ans(a,b,c+i,ans+i);
//		int f2=ans(a,b,c+2,ans+"2");
//		int f3=ans(a,b,c+3,ans+"3");
		}
//		return f1+f2+f3;
		return f1;
	}

}
