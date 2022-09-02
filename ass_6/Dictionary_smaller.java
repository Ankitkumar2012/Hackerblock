package ass_6;

import java.util.Scanner;

public class Dictionary_smaller {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
//		String str=ak.nextLine();
		String str="abc";
		ans(str,"");
	}

	private static void ans(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			String atr=str.substring(0,i)+str.substring(i+1);
			char ch=str.charAt(i);
			ans(atr,ans+ch);
		}
	}

}
