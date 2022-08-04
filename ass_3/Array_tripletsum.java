package ass_3;

import java.util.*;
import java.util.Arrays;

public class Array_tripletsum {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 2, 1, 4, 6, 8, 3 };
		int n = 10;

//	     Scanner ak=new Scanner (System.in);
//        int a=ak.nextInt();
//        int [] arr=new int [a];
//        for(int i=0; i<arr.length; i++){
//            arr[i]=ak.nextInt();
//        }
//        int n=ak.nextInt();
//        
		Arrays.sort(arr);
		ans(arr, n);

	}

	private static void ans(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int l = arr[i] + arr[j] + arr[k];
					if (l == n) {
						if (arr[j] < arr[k]) {
							System.out.println(arr[i] + "," + arr[j] + " and " + arr[k]);
						} else {
							System.out.println(arr[i] + "," + arr[k] + " and " + arr[j]);

						}
					}
				}
			}
		}

	}

}
