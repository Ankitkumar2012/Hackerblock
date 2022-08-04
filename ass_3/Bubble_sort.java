package ass_3;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=ak.nextInt();	
			}
		BubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void BubbleSort(int [] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
	}

}
