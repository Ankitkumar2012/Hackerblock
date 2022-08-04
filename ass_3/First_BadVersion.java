package ass_3;

public class First_BadVersion {
	public static void main(String[] args) {
		int a=5;
		int b=4;
		System.out.println(FirstbadVersion(a));
	}
	public static boolean isbadversion(int version) {
		return false;
	}
	   public static  int FirstbadVersion(int a){
		int lo=1;
		int hi=a;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
		     if(isbadversion(mid)==true) {
		    	 ans=mid;
		    	 hi=mid-1;
		     }else {
		    	 lo=mid+1;
		     }
		}
		return ans;
		
	}

}
