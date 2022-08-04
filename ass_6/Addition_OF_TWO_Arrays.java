package ass_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addition_OF_TWO_Arrays {
	public static void main(String[] args) {
//		int[] arr = { 1, 0, 2, 9 };
//		int[] brr = { 3, 4, 5, 6, 7 };
		Scanner ak=new Scanner (System.in);
		int n= ak.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=ak.nextInt();
		}
		int m= ak.nextInt();
		int [] brr= new int [m];
		for(int i=0;i<m;i++) {
			brr[i]=ak.nextInt();
		}
		List<Integer> list = new ArrayList<>();

		int i = arr.length - 1;
		int j = brr.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = 0;

			if (i >= 0) {
				sum = carry + arr[i];
				i--;

			}
			if (j >= 0) {
				sum += brr[j];

				list.add(0, sum % 10);
				carry = sum / 10;
				j--;

			}

		}

		for (int k = 0; k < list.size(); k++) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.println("END");

	}

}
