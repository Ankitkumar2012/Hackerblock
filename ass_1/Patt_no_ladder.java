package ass_1;
import java.util.*;
public class Patt_no_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int val=1;
		int star=1;
		while(row<=n) {
			int st=1;
			while(st<=row) {
				System.out.print(val+"\t");
				val++;
				st++;
			}
			row++;
			System.out.println();
		}
		

	}

}
