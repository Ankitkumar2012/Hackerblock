package ass_1;
import java.util.*;
public class Patt_with_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int row=1;
		int val=1;
		while(row<=n) {
			int st=1;	
			while(st<=row) {
				if(st==1 || st==row) {
					val=row;
				}else {
					val=0;
				}
				System.out.print(val+"\t");
				st++;
			}
			row++;
			System.out.println();
		}	
	}

}
