package ass_2;

import java.util.Scanner;

public class Sum_of_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		ans(n);

	}
	public static void ans(int n) {
		int so=0;
		int se=0;
		int i=1;
		while(n!=0) {
			int r=n%10;
			if(i%2!=0) {
				so=so+r;
			}else {
		        se=se+r;
			}
			i++;
			n=n/10;
		 }
		System.out.println(so);
		System.out.println(se);
		
		}
}
