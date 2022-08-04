package ass_5;

import java.util.Scanner;

public class String_compression {
	public static void main(String[] args) {
		String str="aaabbccds";
		//Scanner ak=new Scanner (System.in);
		//String str=ak.nextLine();
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		// TODO Auto-generated method stub
		String ans="";
	    for (int i = 0 ; i < str.length(); i++) {
	    	char ch=str.charAt(i);
	    	int count=1;
	    	while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
	    		count ++;
	    		i++;
	    	}
	    	if(count==1) 
	    	ans=ans+ch+"1";
	    	else {
	    		ans=ans+ch+count;
	    	}
	    }
		return ans;
	    	
	}

}
