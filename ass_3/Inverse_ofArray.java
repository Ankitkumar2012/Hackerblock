package ass_3;

import java.util.Scanner;

public class Inverse_ofArray {
	public static void main(String[] args) {
	 Scanner ak=new Scanner (System.in);
	 int n=ak.nextInt();
	 int [] arr=new int [n];
	 int [] brr=new int [n];
	 for(int i=0; i<arr.length; i++) {
		 arr[i]=ak.nextInt();
	 }
	 inverse(arr,brr);
	 for(int i=0; i<arr.length; i++) {
		 System.out.println(brr[i]);
	 }
	 
	}
	public static void inverse(int [] arr, int [] brr) {
		for(int i=0; i<arr.length; i++) {
			brr[arr[i]]=i;
		}
		
	}

}
