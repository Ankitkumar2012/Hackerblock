package ass_3;

import java.util.Scanner;

public class Array_sumpairs {
	public static void main(String[] args) {
//		Scanner ak=new Scanner(System.in); 
//		int n=ak.nextInt();
//		int [] arr =new int [n];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=ak.nextInt();
//		}
//		int a=ak.nextInt();
		int arr[]= {1,3,4,2,5};
		int a=5;
		ans(arr,a);
	}
	public static void ans(int [] arr, int a) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==a) {
					if(arr[i]<arr[j]) {
					System.out.println(arr[i]+" and "+arr[j]);
					}else {
					System.out.println(arr[j]+" and "+arr[i]);
					}
				}
			}
		}
		
	}

}
