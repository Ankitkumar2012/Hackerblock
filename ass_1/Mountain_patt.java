package ass_1;

import java.util.Scanner;

public class Mountain_patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int star=1;
		int space=5;
		int val=1;
		while(row<=n) {
			int st=1;
			int v=val;
			while(st<=star) {
				System.out.print(v+" ");
				v++;
				st++;
			}
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st2=1;
			int l=row;
			if(row==n) {
				st2++;
				l=n-1;
			}
			while(st2<=star) {
				System.out.print(l+" ");
				st2++;
				l--;
			}
			row++;
			star++;
			space-=2;
			System.out.println();
		}

	}

}
