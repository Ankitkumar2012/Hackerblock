package ass_6;

public class Generate_parenthesis {
	public static void main(String[] args) {
		int n=2;
		ans(n,0,0,"");
	}

	private static void ans(int n,int open,int close,String str) {
		// TODO Auto-generated method stub
       if(open==n && close==n) {
    	   System.out.println(str);
    	   return; 
       }
		
		if(close<open)
		ans(n,open,close+1,str+")");
		if(open<n)
			ans(n,open+1,close,str+"(");
	}

}
