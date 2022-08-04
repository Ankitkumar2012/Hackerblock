package ass_2;

import java.util.Scanner;

public class Booston_no {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		        long N= sc.nextLong();
		        System.out.println(result(N));
		}
		       public static long prime_fact(long N) {
		    	   long sum1=0;
		    	   for(int i = 2; i<=N; i++) {
		    	         while(N%i == 0) {
		    	        sum1=sum1+sum(i);
		    	        N= N/i;
		    	      }
		    	         }  
		    	      return sum1;
		       }
		       public static long sum(long N) {
		    	   long sum2=0;
		    	   while(N>0) {
		    		   long rem=N%10;
		    		   sum2=sum2+rem;
		    		   N=N/10;
		    	   }
		    	   return sum2;
		       }
		       public static int result(long N) {
		    	   long x=prime_fact(N);
		    	   long y=sum(N);
		       if(x==y) {
		    return 1;
		       }
		       else
		       {
		    	   return 0;
		       }
		    	   

	}

}
