package ass_5;

import java.util.Scanner;

public class Ascaii_code {
	public static void main(String[] args) {
		String str="acb";
		Scanner ak=new Scanner (System.in);
	//	String str=ak.nextLine();
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		// TODO Auto-generated method stub
		String atr="";
		for(int i=0; i<str.length()-1;i++) {
			int a=str.charAt(i+1)-str.charAt(i);
					atr=atr+str.charAt(i)+a+"";
		}
		atr=atr+str.charAt(str.length()-1);
		return atr;
	}
}
