package ass_2;

import java.util.Scanner;

public class Print_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		ans(n);
		
		}
	public static void ans(int n) {
		int x,y,c = 0;
		for(x=2; x<=n; x++) {
			if(x==1 || x==0)
				continue;
			c=1;
			for(y=2; y<=x/2; ++y) {
				if(x%y==0) {
					c=0;
					break;
				}
			}
			if(c==1)
				System.out.println(x);
		}
		
	}
}
