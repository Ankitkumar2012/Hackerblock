package ass_3;

import java.util.Scanner;

public class Insertion_sort {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=ak.nextInt();	
			}
		InsertionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		public static void InsertionSort(int [] arr) {
			for(int i=0; i<arr.length;i++) {
				int j=i-1;
				int temp=arr[i];
					while(j>0 && arr[j]>temp) {
						arr[j+1]=arr[j];
						j--;
						}
					j++;
					arr[j]=temp;
				}
			
			}
}
