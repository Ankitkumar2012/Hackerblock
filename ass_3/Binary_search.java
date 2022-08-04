package ass_3;

import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr= new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=ak.nextInt();
		}
		int item=ak.nextInt();
         System.out.println(binarysearch(arr,item));
	}
	public static int binarysearch(int [] arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		int mid=(lo+hi)/2;
		while(lo<=hi) {
			if(item==arr[mid]) {
				return mid;
			}else if(item<arr[mid]) {
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return -1;
		
	}

}
