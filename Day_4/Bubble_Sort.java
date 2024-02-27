package Day_4;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int arr[] = {6,8,2,4,5,9};
        System.out.println("Before Sorting .");
        for (int i : arr) {
			System.out.print(i +" ");
		}
		
		BubbleSort(arr);
		
		
	}

	private static void BubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1] ) {
				  temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
				}
			}
			System.out.println();
			for (int num : arr) {
				System.out.print(num +" ");
			}
		}
		System.out.println();
		System.out.println("After Sorting .");
	  for (int i : arr) {
		System.out.print(i + " ");
	}
	}

}
