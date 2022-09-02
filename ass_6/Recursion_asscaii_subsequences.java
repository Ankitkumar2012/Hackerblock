package ass_6;

import java.util.Scanner;

public class Recursion_asscaii_subsequences {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		System.out.println("\n"+ans(str,""));
	}

	private static int ans(String str,String ans) {
		if(str.length()==0) {
		  System.out.print(ans+" ");
			return 1;
		}
		
		char ch=str.charAt(0);
		int f1=ans(str.substring(1),ans);
		int f2=ans(str.substring(1),ans+ch);		
		int f3=ans(str.substring(1),ans+(int)ch);
		return f1+f2+f3;
	}

}
