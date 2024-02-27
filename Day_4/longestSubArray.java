package Day_4;

import java.util.Scanner;

public class longestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	longestSubArray(arr,k);
	}

	private static void longestSubArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		for (int size = arr.length; size > 0; size--) {
			for (int i = 0; i <= arr.length-size; i++) {
				int sum= 0;
				for (int j = i; j < i+size; j++) {
					sum = sum + arr[j];
				}
				if (sum==k) {
					for (int j = i; j < i+size; j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
					return;
				}
			}
		}
	}

}
