package ass_5;

import java.util.Scanner;

public class Pall_stringCount {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
	//	String str ="abc";
		System.out.println(ans(str));
	}

	private static int ans(String str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				if(ispall(str.substring(i, j))==true) {
					count++;
				}
			}
		}
		return count;
		
	}
	public static boolean ispall(String str) {
		int a=0; 
		int b=str.length()-1;
		while(a<b) {
			if(str.charAt(a)!=str.charAt(b)) {
				return false;
			}
			a++;
			b--;
		}
		return true;
		
	}

}
