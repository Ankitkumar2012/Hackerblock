package ass_6;

import java.util.Scanner;

public class Repeating_digit {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		ans(str,"");
	}

	private static void ans(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		if(str.length()>=2&&str.charAt(0)==str.charAt(1)) {
			ans(str.substring(1),ans+str.charAt(0)+"*");
		}
		else {
			ans(str.substring(1),ans+str.charAt(0));
		}
		
	}

}
