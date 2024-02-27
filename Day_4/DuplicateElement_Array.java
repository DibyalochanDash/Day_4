package Day_4;

import java.util.HashSet;

public class DuplicateElement_Array {

	public static void main(String[] args) {
		  int arr[]= {1,2,3,1,2,3,4,5};
		  
		  DuplicateElementArray(arr);
		  
		  AnotherApproach(arr); // Another  Way Solve 

	}

	private static void AnotherApproach(int[] arr) {
		System.out.println();
		 System.out.print("Duplicates are: ");
		    
		    // Create a HashSet to store unique elements
		    HashSet<Integer> set = new HashSet<>();
		    
		    for (int i = 0; i < arr.length; i++) {
		        // If the element is already in the set, it's a duplicate
		        if (!set.add(arr[i])) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		
	}

	private static void DuplicateElementArray(int[] arr) {
		System.out.print("Duplicate are : ");
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}

}
