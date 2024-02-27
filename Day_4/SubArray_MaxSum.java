package Day_4;

import java.util.Scanner;

public class SubArray_MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	maxSubArray(arr);
	
	}

	private static void maxSubArray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for (int i = 0; i < arr.length; i++) {
			curSum = curSum+arr[i];
		}
		if (curSum > maxSum) {
			maxSum = curSum;
			
		}
		if (curSum < 0) {
			curSum =0;
		}
		System.out.println(maxSum);
		
	}

}
