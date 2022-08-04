package ass_2;

import java.util.Scanner;

public class Any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int a=ak.nextInt();
		int b=ak.nextInt();
		int n=ak.nextInt();
		ans(a,b,n);
	}
	public static int vns(int a,int n) {
		int sum=0;
		int mul=1;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*a;
		}
		return sum;
	}
	
	public static void ans(int a,int b,int n) {
		int sum=vns(a,n);
		int d=0;
		int mul=1;
		while(sum!=0) {
			int rem=sum%b;
			d=d+rem*mul;
			sum=sum/b;
			mul=mul*10;
		}
		System.out.println(d);
		
	}
	
}
