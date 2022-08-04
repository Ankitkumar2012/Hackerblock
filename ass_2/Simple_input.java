package ass_2;

import java.util.Scanner;

public class Simple_input
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int sum=0;
		while(sum>=0) {
			int n=ak.nextInt();
			sum=sum+n;
			if(sum>=0) {
				System.out.println(n);
			}
		}

	}

}
