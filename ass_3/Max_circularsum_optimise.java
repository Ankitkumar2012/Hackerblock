package ass_3;

public class Max_circularsum_optimise {
	public static void main(String[] args) {
		int [] arr= {1,-2,3,-2};
		System.out.println(ans(arr));
	}
	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int ksum=kadens(arr);
		int nsum=0;
		for(int i=0;i<arr.length;i++) {
			nsum+=arr[i];
			arr[i]*=-1;
		}
		int negsum=kadens(arr);
		int cirsum=negsum+nsum;
		int t=Math.max(ksum, cirsum);
		if(cirsum==0) {
			return ksum;
		}
		return t;
	}
	public static int kadens(int [] arr) {
		int ans=Integer.MIN_VALUE;
		int presum=0;
		for(int i=0;i<arr.length; i++) {
			presum=presum+arr[i];
			ans=Math.max(ans, presum);
			if(presum<=0) {
				presum=0;
			}
		}
		
	return ans;
	
	}	

}
