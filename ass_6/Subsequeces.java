package ass_6;

import java.util.Scanner;

public class Subsequeces {
	static int count=0;
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		System.out.print("\n"+ans(str,""));
	}
	private static int ans(String str,String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.print(ans+" ");
			count++;
			return count;
		}
		ans(str.substring(1),ans);
		return ans(str.substring(1),ans+str.charAt(0));
		
	}

}
