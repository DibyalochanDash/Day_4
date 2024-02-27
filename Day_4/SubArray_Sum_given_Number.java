package Day_4;

public class SubArray_Sum_given_Number {

	public static void main(String[] args) {
		
		int arr[] = {4,5,6,2,3,8,9};
		int size = 3;
		int target = 13;
				
		SubarraySumGivenNumber(arr,target,size);
	}

	private static void SubarraySumGivenNumber(int[] arr,int target, int size) {
		for (int i = 0; i <= arr.length-size; i++) {
			int sum = 0;
			for (int j = i; j < i + size; j++) {
				sum += arr[j];
			}
			if (sum == target) {
				for (int j = i; j < i+size; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
