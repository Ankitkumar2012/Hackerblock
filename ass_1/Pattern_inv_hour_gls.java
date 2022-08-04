package ass_1;

import java.util.Scanner;

public class Pattern_inv_hour_gls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int star=1;
		int space=2*n-1;
		int val=n;
		while(row<=2*n+1) {
			int st=1;
			int v=val;
			while(st<=star){
				System.out.print(v+" ");
				st++;
				v--;
			}
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st2=1;
			v++;
			if(row==n+1) {
				st2++;
				v++;
			}
			while(st2<=star) {
				System.out.print(v+" ");
				st2++;
	            v++;
			}
			if(row<=n) {	
            star++;
            space-=2;
			}else {
				star--;
				space+=2;
			}
			row++;
			System.out.println();
		}
	}

}
