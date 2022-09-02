package ass_6;

import java.util.Scanner;

public class Replace_all_PI {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		while(n-->=0) {		
	    String str=ak.nextLine();
	    String ans="";
		print(str,ans);
		}  
	 }
	private static void print(String str,String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		if(str.charAt(0)=='p'&&str.charAt(1)=='i') {
			print(str.substring(2),ans+3.14);	
		}
		else {
			 print(str.substring(1),ans+str.charAt(0));
		}
	}

}
