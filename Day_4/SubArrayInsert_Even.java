package Day_4;

import java.util.Scanner;

public class SubArrayInsert_Even {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int size = sc.nextInt();
		int k = sc.nextInt();
		SubArrayInsert_Evens(arr,size,k);
	}

	private static void SubArrayInsert_Evens(int[] arr, int size,int k) {
		for (int i = 0; i <= arr.length-size; i++) {
			int sum =0;
			for (int j = i; j < i+size; j++) {
			   sum = sum+ arr[j];
			}
			if (sum == k) {
				for (int j = i; j < i+size; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
