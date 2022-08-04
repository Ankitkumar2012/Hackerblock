package ass_1;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		int n=ak.nextInt();
		int row=0;
		int star=1;
		while(row<n) {
			int val=1;
			int st=0;
			while(st<star) {
			System.out.print(val+" ");
			val=((row-st)*val)/(st+1);
			st++;
			}
			row++;
			System.out.println();
			star++;
		}

	}

}
