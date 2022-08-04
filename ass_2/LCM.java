package ass_2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int N1=ak.nextInt();
		int N2=ak.nextInt();
		LCM(N1,N2);

	}
	public static void LCM(int N1,int N2) {
		int i=0;
		int lcm=0;
		if(N1>N2) {
			 lcm=N2;
		}else {
			 lcm=N1;
		}
		for(i=lcm; i<=N1*N2; i=i+lcm) {
			if(i%N1==0 &&i%N2==0)
				break;
		}
		System.out.println(i);
		
	}

}
