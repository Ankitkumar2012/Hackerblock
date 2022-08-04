package ass_3;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_ofRose {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n= sc.nextInt();
			int [] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]= sc.nextInt();
			}
			int target= sc.nextInt();
			Arrays.sort(arr);
			ans(arr,target);

		}
//		int [] arr = {10,2,6,8,4};
//		int target=10;
	}
	public static void ans(int [] arr, int target) {
		int x=0;
		int y=0;
		int diff=Integer.MAX_VALUE;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int t=arr[i]+arr[j];
				if(t==target) {
					int k=arr[j]-arr[i];
					if(diff>k) {
						diff=k;
						x=arr[i];
						y=arr[j];
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+x+" and "+y+".");
	}

}
