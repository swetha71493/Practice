package interview.programs;

import java.util.Arrays;

class ArrayDupRem {

	public static void main(String[] args) { 
		int[] arr = {8,7,5,4,6,3,2,1,1,2,2,3,4,5,6,7,8};
		System.out.println( arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}			
		}
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
		}
		// for(int i=0;i<arr.length;i++)
		// System.out.println(arr[i]);

		for (int i = 0; i < arr.length; i++) {
			try {
				if (arr[i] != arr[i + 1])
					System.out.println(arr[i]);

				// System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println(arr[i]);

			}
		}

	}

}
