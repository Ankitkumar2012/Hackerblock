package ass_1;

import java.util.Scanner;

public class F_to_c_conver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int minf=ak.nextInt();
		int maxf=ak.nextInt();
		int step=ak.nextInt();
		
		for(int i=minf; i<=maxf; i=i+step) {
		int c=(int)((5.0/9)*(i-32));
		System.out.println(i+"\t"+c);
		}

	}

}
