package ass_1;

import java.util.Scanner;

public class Patt_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
	    int n=ak.nextInt();
	    int row=1;
	    int star=1;
	    int space=n-1;
	    int val=1;
	    while(row<=n*2-1) {
	    	int sp=1;
	    	while(sp<=space) {
	    		System.out.print("  ");
	    		sp++;
	    	}
	    	int st=1;
	    	int v=val; 
	    	while(st<=star) {
	    		System.out.print(v+" ");
	    		if(st<=star/2) {
		    		v++;
		    	}else {
		    		v--;
		    	}
	    		st++;
	    	}
	    	if(row<n) {
	    		space--;
	    		star+=2;
	    		val++;
	    	}else {
	    		space++;
	    		star-=2;
	    		val--;
	    	}
	    	row++;
	    	System.out.println();
	    }

	}

}
