package ass_4;

import java.util.Iterator;
import java.util.Scanner;

public class Piyush_magicalPark {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int m=ak.nextInt();
		int k=ak.nextInt();
		int s=ak.nextInt();
		char[][]arr=new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] =ak.next().charAt(0);
			}
		}
		ans(arr,k,s);
	}

	private static void ans(char[][] arr, int k, int s) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(s<k) {
					break;
				}
				if(arr[i][j]=='*') {
					s+=5;
				}else if(arr[i][j]=='.'){
					s-=2;
				}else {
					break;
				}
				if(j!=arr[0].length-1) {
					s--;
				}
			}
				
			}
		if(s>=k) {
			System.out.println("Yes");
			System.out.println(s);
		}else {
			System.out.println("No");
		}
		
		}
	}

