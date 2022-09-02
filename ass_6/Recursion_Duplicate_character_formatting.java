package ass_6;

public class Recursion_Duplicate_character_formatting {
	public static void main(String[] args) {
		String str="hello";
		String k=ans(str,"");
		System.out.println(k);
	}

	private static String ans(String str,String ans) {
		if(str.length()==0) {
			return  ans;
		}
		String s="";
		if(str.length()>=2 && str.charAt(0)==str.charAt(1)) {
			s+=ans(str.substring(2),ans+str.charAt(0)+"*"+str.charAt(1));
		}
		else {
			s+=ans(str.substring(1),ans+str.charAt(0));
		}
		return s;
	}

}
