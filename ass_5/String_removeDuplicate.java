package ass_5;

import java.util.Scanner;

public class String_removeDuplicate {
	public static void main(String[] args) {
	//	Scanner ak=new Scanner (System.in);
		//String str=ak.nextLine();
		String str="aabccba";
		System.out.println(ans(str));
	}

	public  static String ans(String str) {
		// TODO Auto-generated method stub
		String atr="";
		atr=atr+str.charAt(0);
		for(int i=1; i<str.length();i++) {
				if(str.charAt(i)!=str.charAt(i-1)) {
					atr=atr+str.charAt(i);
				}
			}
		return atr;
		
	}
}
