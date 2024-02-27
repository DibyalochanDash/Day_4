package Day_4;

public class Pairs_Sum_Given_Number {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8};
        int target = 10;
        Pairs_Sum(arr, target);
    }

    private static void Pairs_Sum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
