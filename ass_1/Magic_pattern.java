package ass_1;
import java.util.*;
public class Magic_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int space=-1;
		int star=n/2+1;
		while(row<=n) {
			int st=1;
			while(st<=star) {
				System.out.print("*"+" ");
				st++;
			}
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st2=1;
			if(row==1 || row==n) {
				st2++;
			}
			while(st2<=star) {
				System.out.print("*"+" ");
				st2++;
			}
			if(row<=n/2) {
			star--;
			space+=2;
			}else {
				star++;
				space-=2;	
			}
			row++;
			System.out.println();
			
		}

	}

}
