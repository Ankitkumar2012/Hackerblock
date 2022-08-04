package ass_3;

import java.util.Scanner;

public class Trapping_rainwater {
	public static void main(String[] args) {
		//int [] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		Scanner ak=new Scanner (System.in);
		int a=ak.nextInt();
		while(a-->0) {
		int n=ak.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=ak.nextInt();
		}
		
		System.out.println(trapping(arr));
		}
	}
	public static int trapping(int [] arr) {
		
		int n=arr.length;
		int [] left =new int [n];
		int [] right =new int [n];
		left[0]=arr[0];
		for(int i=1; i<n; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int sum=0;
		for(int i=0; i<n;i++) {
			sum=sum+Math.min(left[i], right[i])-arr[i];
		}
		return sum;
		
	}

}
