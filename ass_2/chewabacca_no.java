package ass_2;

import java.util.Scanner;

public class chewabacca_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		long n=ak.nextLong();
		long sum=0;
		int mul=1;
		while(n>9) {
			long rem=n%10;
			if(rem>=5) {
				sum=sum+(9-rem)*mul;
			}else {
				sum=sum+rem*mul;
			}
			n=n/10;
			mul=mul*10;
		}
		if(n==9) {
			sum=sum+n*mul;
		}else if(n>=5) {
			sum=sum+(9-n)*mul;
		}else {
			sum=sum+n*mul;
		}
		System.out.println(sum);

	}

}
