package ass_2;

import java.util.Scanner;

public class Bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int mul=1;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*2;
		}
		System.out.println(sum);

	}

}
