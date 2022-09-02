package ass_5;

import java.util.Scanner;

public class MaxTime_numinString {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		//String str=ak.nextLine();
		String str = "aaabacbcccccc";
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		// TODO Auto-generated method stub
		int val=0;
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			int mval=0;
			for (int j = 0; j <str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					mval++;
				}
			}
			if(mval>val) {
				val=mval;
				ans=str.charAt(i)+"";
			}
		}
		return ans;
		
	}

}
