package ass_2;

import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak= new Scanner (System.in);
		int n= ak.nextInt();
		int i=2;
		int f=0;
		while(i<n) {
			if(n%i==0) {
				f=f+1;
				break;
			}
			i=i+1;
		}
		if(f>=1) {
			System.out.println(" Not Prime");
		}else {
			System.out.println("Prime");
		}

	}

}
