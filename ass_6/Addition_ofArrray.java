package ass_6;

import java.util.Scanner;

public class Addition_ofArrray {
	public static void main(String[] args) {
		int arr[] = {9,2,3};
		int brr[] = {9,9,2,3,4};
		Scanner ak=new Scanner (System.in);
//		int n= ak.nextInt();
//		int [] arr= new int [n];
//		for(int i=0;i<n;i++) {
//			arr[i]=ak.nextInt();
//		}
//		int m= ak.nextInt();
//		int [] brr= new int [m];
//		for(int i=0;i<m;i++) {
//			brr[i]=ak.nextInt();
//		}
		ansr(arr, brr);
	}

	private static void ansr(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int s = ans(arr, brr);
		String k = s + "";
		StringBuilder m = new StringBuilder(k);
		m = m.reverse();
		k = m + "";
		s = Integer.parseInt(k);
		while (s != 0) {
			int rem = s % 10;
			System.out.print(rem + ", ");
			s = s / 10;
		}
		System.out.println("END");
	}

	private static int ans(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		String str = "";
		String atr = "";
		int t;
		int r;
		for (int i = 0; i < brr.length; i++) {
			str = str + brr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			atr = atr + arr[i];
		}

		t = Integer.parseInt(str);
		r = Integer.parseInt(atr);
		return t + r;
	}

}
