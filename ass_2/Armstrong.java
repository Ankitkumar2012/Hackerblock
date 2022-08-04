package ass_2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak= new Scanner (System.in);
		int n=ak.nextInt();
		System.out.println(ans(n));

	}
	public static boolean ans(int n) {
		int d=num_of_dig(n);
		int sum=0;
		int x=n;
		while(n!=0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, d));
			n=n/10;
		}
		if(sum==x) {
			return true;
		}else {
			return false;
		}
	}
	public static int num_of_dig(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;	
		}
		return count;
		
	}

}
