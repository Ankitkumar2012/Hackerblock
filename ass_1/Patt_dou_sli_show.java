package ass_1;

import java.util.Scanner;

public class Patt_dou_sli_show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int space1=n-1;
		int star=1;
		int space2=-1;
		int row=1;
		int val=1;
		while(row<=n) {
			int sp1=1;
			while(sp1<=space1) {
				System.out.print("  ");
				sp1++;
			}
			int v=val;
			int st1=1;
			while(st1<=star) {
				System.out.print(v+" ");
				v--;
				st1++;
			}
			int sp2=1;
			while(sp2<=space2) {
				System.out.print("  ");
				sp2++;
			}
			int st2=1;
			int l=1;
			if(row==1 || row==n) {
				st1++;
			}
			while(st2<=star) {
				System.out.print(l+" ");
				st2++;
				l++;
			}
			if(row<=n/2) {
				space1-=2;
				star++;
				space2+=2;
				val++;			
			}else {
				space1+=2;
				star--;
				space2-=2;
				val--;
			
			}
			row++;
			System.out.println();
		}
		

	}

}
