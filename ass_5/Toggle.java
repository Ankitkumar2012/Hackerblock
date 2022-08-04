package ass_5;

import java.util.Scanner;

public class Toggle {
	public static void main(String[] args) {
     Scanner ak=new Scanner (System.in);
      String str=ak.nextLine();
	//	String str="aaabacb";
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		String ans="";
		   for (int i=0; i<str.length() ; i++) {
			   if(Character.isUpperCase(str.charAt(i)))
				   ans=ans+Character.toLowerCase(str.charAt(i));
			   else if(Character.isLowerCase(str.charAt(i)))
				   ans=ans+Character.toUpperCase(str.charAt(i));
		   }
		return ans;
		
	}

}
