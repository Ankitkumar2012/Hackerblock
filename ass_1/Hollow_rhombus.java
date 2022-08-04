package ass_1;
import java.util.*;
public class Hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int star=n;
		int space=n-1;
		while(row<=n) {
			int sp=1;
			while(sp<=space){
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				if(row==1 || row==n) {
				System.out.print("*");
				}
				else if (st==1 || st==n){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				st++;
			}
			row++;
			space--;
			System.out.println();
		}

	}
}