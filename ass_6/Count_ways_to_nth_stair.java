package ass_6;


public class Count_ways_to_nth_stair {
	public static void main(String[] args) {
		int n=4;
		System.out.println(ans(n,1));
	}

	private static int ans(int n,int lp) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		if(n<0)  return 0;
		int count=0;
		  for (int j = lp; j <= 2; j++) {
			count+=ans(n-j, j);
		}
		return count;
		
	}

}
