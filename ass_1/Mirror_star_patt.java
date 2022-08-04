package ass_1;
import java.util.*;
public class Mirror_star_patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
	    int n=ak.nextInt();
	    int row=1;
	    int star=1;
	    int space=n-1;
	    while(row<=n) {
	    	int sp=1;
	    	while(sp<=space) {
	    		System.out.print("  ");
	    		sp++;
	    	}
	    	int st=1;
	    	while(st<=star) {
	    		System.out.print("* ");
	    		st++;
	    	}
	    	if(row<=n/2) {
	    		space--;
	    		star+=2;
	    	}else {
	    		space++;
	    		star-=2;
	    	}
	    	row++;
	    	System.out.println();
	    }

	}

}
