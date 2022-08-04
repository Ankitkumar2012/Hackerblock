package ass_3;

public class Kedans {
	public static void main(String[] args) {
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(sum(arr));
	}
	public static int sum(int [] arr) {
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
