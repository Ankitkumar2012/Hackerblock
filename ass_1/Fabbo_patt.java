package ass_1;

import java.util.Scanner;

public class Fabbo_patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int r=1;
		int star=1;
		int val=0;
		int v1=0;
		int v2=1;
		while(r<=n) {
			int st=1;
			while(st<=star) {
				if(r==1) {
					val=v1;
				}else {
					v1=v2;
					v2=val;
				    val=v1+v2;
				}
			System.out.print(val+"\t");
				st++;
			}
			r++;
			star=r;
			System.out.println();
		}

	}

}