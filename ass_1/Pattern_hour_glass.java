package ass_1;
import java.util.*;
public class Pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int star=n*2+1;
		int space=0;
		int val=n;
		while(row<=n*2+1) {
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int v=val;
			int st=1;
			while(st<=star) {
				System.out.print(v+" ");
				if(st<=star/2) {
					v--;
				}else {
					v++;
				}
		          st++;
			}
			if(row<=n) {
				space++;
				star-=2;
				val--;
			}else {
				space--;
				star+=2;
				val++;
			}
			row++;
			System.out.println();
		}

	}

}
