package ass_3;
import java.util.*;
public class Product{
	public static void main(String [] args) {
		Scanner ak=new Scanner (System.in);
        int n=ak.nextInt();
        int [] arr=new int [n];
        for(int i=0; i<arr.length; i++){
            arr[i]=ak.nextInt();
        }
    	long [] ans=mul(arr);
		for(int  i=0; i<ans.length; i++) {
		System.out.print(ans[i]+" ");
        
		}
	}
	public static long[] mul(int [] arr) {
			int a=arr.length;
			long [] left= new long [a];
			left[0]=1;
			for(int i=1; i<a; i++) {
				left[i]=left[i-1]*arr[i-1];
		}
			long [] right= new long [a];
			right[a-1]=1;
			for(int i=a-2; i>=0; i--) {
				right[i]=right[i+1]*arr[i+1];
		}
			for(int i=0; i<arr.length;i++) {
				left[i]=left[i]*right[i];
			}

			return left;
		
	}

}
