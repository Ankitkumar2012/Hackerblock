package ass_3;

import java.util.Iterator;

public class Maximum_subarrySum {
	public static void main(String[] args) {
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		 System.out.println(SubArraySum(arr));
		
	}
	public static int SubArraySum(int [] arr) {
		int sum=Integer.MIN_VALUE;
			for (int i=0; i<arr.length;i++) {
				int presum=0;
				for(int j=i; j<arr.length; j++) {
					presum+=arr[j];
					sum=Math.max(sum,presum);
				}
			}
		return sum;
		
	}

}
