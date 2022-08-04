package ass_3;

import java.util.Scanner;

public class Maximum_circularSum {
	public static void main(String[] args) {
		//int [] arr= {1,-2,3,-2};
		Scanner ak=new Scanner (System.in);
		int a=ak.nextInt();
		while(a-->0) {
		int n=ak.nextInt();
		int [] arr =new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=ak.nextInt();
		}
		System.out.println(cir_sum(arr));
	}
	}
	public static int cir_sum(int [] arr) {
		int lin_sum=sum(arr);
		int totalsum=0;
		for (int i = 0; i < arr.length; i++) {
			totalsum += arr[i];// totalsum = totalsum + arr[i];
			arr[i] = arr[i] * -1;

		}
		int mid_sum = sum(arr);

		int cir_sum = totalsum + mid_sum;
		if(cir_sum==0) {
			return lin_sum;
		}

		return Math.max(lin_sum, cir_sum);

		
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
