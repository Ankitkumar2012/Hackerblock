package ass_3;

import java.util.Scanner;

public class Selection_sort {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=ak.nextInt();	
			}
		selectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
		public static void selectionSort(int [] arr) {
			for(int i=0; i<arr.length;i++) {
				int mini=i;
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j]<arr[mini]) {
						mini=j;
					}
				}
				int t=arr[i];
				arr[i]=arr[mini];
				arr[mini]=t;
				
			}
			
			}

}
