package ass_2;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int d=ak.nextInt();
		System.out.println(ans(n,d));

	}
	public static int ans(int n, int d) {
       int b=0;
       while(n!=0) {
    	   if(n%10 == d) {
    		   b=b+1;
    	   }
    	   n=n/10;	   
       }
	return b;
	
	}
}