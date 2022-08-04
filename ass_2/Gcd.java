package ass_2;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int dt=ak.nextInt();
		int dr=ak.nextInt();
		System.out.println(ans(dt,dr));

	}
	public static int ans(int dt,int dr) {
		while(dt%dr!=0) {
			int rem=dt%dr;
			dt=dr;
			dr=rem;
		}
		return dr;
		
	}

}
