package ass_6;

import java.util.Scanner;

public class Recursive_keypad_codes {
	static String [] mob= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
//		String str="12";
		System.out.println("\n"+ans(str,""));
	}
	private static int ans(String str,String ans) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		int f1=0;
		char ch=str.charAt(0);
		String string=mob[ch-48];
		for (int i = 0; i < string.length(); i++) {
		 f1+=ans(str.substring(1),ans+string.charAt(i));
		}
		return f1;
	}

}
