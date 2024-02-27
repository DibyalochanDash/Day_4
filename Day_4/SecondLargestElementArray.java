package Day_4;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		
		int [] arr = {4,5,2,7,8,9,6,9 };
        SecondNumberArray(arr);
	}

	private static void SecondNumberArray(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if(arr[i] > second && arr[i]!= first){
                second = arr[i];
			}
		}
		System.out.println(second);
	}

}
