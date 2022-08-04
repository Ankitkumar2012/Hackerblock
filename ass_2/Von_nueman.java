package ass_2;

import java.util.Scanner;

public class Von_nueman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		for(int i=1; i<=n; i++) {
			int a=ak.nextInt();
			int sum=0;
			int mul=1;
			while(a!=0) {
				int rem=a%10;
				sum=sum+rem*mul;
				a=a/10;
				mul=mul*2;
			}
			System.out.println(sum);
		}
		
	}

}
