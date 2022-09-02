package ass_6;

import java.util.Scanner;

public class Replace_0_with_five {
	public static void main(String[] args) {
//		int n=103;
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		ans(n,"","");
	}

	private static void ans(int n,String ans,String atr) {
		// TODO Auto-generated method stub
		ans=""+n;
		for (int i = 0; i < ans.length(); i++) {
			if(ans.charAt(i)=='0')
				atr+="5";
			else 
				atr+=ans.charAt(i);
		}
		int k=Integer.parseInt(atr);
		System.out.println(k);
	}

}
