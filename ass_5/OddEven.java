package ass_5;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		//String s=ak.nextLine();
		String s = "aaaabbbbaaaa";
		StringBuilder str= new StringBuilder(s);
		ans(str);
	}

	private static void ans(StringBuilder str) {
		// TODO Auto-generated method stub
		        int i=0;
			    while(i<str.length())  {
					str=str.replace(i, i+1, (char)(str.charAt(i)+1)+"");
					i++;
					if(i<str.length()) {
					str=str.replace(i, i+1, (char)(str.charAt(i)-1)+"");
					i++;}
			    }
				System.out.println(str);
				
	}

}
