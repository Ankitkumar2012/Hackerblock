package ass_4;

import java.util.Scanner;

public class Murthal_paratha {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int p=ak.nextInt();
		int l=ak.nextInt();
		int arr []=new int [l];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ak.nextInt();
		}
		System.out.println(ans(arr,p,l));
	}

	private static int ans(int[] arr,int p,int noc) {
		// TODO Auto-generated method stub
		int start=0;
		int ans=0;
		int end=(arr[arr.length-1]*(p*(p+1)))/2;
		while(start<=end) {
			int mid=(start+end)/2;
			if(itispossible(arr,mid,p)) {
				ans =mid;
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return ans;
		
	}

	private static boolean itispossible(int[] arr, int mid, int p) {
		// TODO Auto-generated method stub
		int nop=0;
		for (int i = 0; i < arr.length; i++) {
			int k=1;
			int time=0;
			while(time<=mid) {
				time+=k*arr[i];
				k++;
				if(time<=mid)nop++;
			}
		}
		if(nop>=p)
		return true;
		
		return false;
	}

}
