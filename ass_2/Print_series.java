package ass_2;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int N1=ak.nextInt();
		int N2=ak.nextInt();
		ans(N1,N2);

	}
	public static void ans(int N1, int N2) {
		if(N1>0 && N2<100) {
			int count=0;
			int n=1;
			while(count<N1) {
				int c=3*n+2;
				n++;
				if(c%N2!=0) {
					System.out.println(c);
					count++;
				}
			}
		}
		
	}

}
