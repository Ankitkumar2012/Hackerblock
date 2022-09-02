package ass_5;

import java.util.Scanner;

public class Can_youReadThis {
	public static void main(String[] args) {
		String str="IAmACompetitiveProgrammer";
	//	Scanner ak=new Scanner (System.in);
	//	String str=ak.nextLine();
		ans(str);
	}

	private static void ans(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(i!=0)
				System.out.println();
				System.out.print(str.charAt(i));
			}else {
				System.out.print(str.charAt(i));
			}
		}
		
	}

}
