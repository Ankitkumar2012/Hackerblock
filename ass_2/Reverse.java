package ass_2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak= new Scanner (System.in);
		int n=ak.nextInt();
		while(n!=0) {
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}	
		
	}

}
