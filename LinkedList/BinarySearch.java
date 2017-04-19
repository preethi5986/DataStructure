import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int arraySize = in.nextInt();
		int[] arr = new int[arraySize];
		System.out.println("Enter elements of array: ");

		for (int i = 0; i < arraySize; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println("Enter Element to be searched: ");
		int x = in.nextInt();

		sort(arr);
		System.out.println("Element found at position: " + binarySearch(arr, 0, arr.length - 1, x));
	}

	static int binarySearch(int[] arr, int startIndex, int endIndex, int searchInt) {

		if (endIndex >= startIndex) {
			int mid = (startIndex + endIndex) / 2;

			if (searchInt == arr[mid]) {
				return mid;
			} else if (searchInt > arr[mid]) {
				return binarySearch(arr, mid + 1, endIndex, searchInt);
			} else if (searchInt < arr[mid]) {
				return binarySearch(arr, startIndex, mid - 1, searchInt);
			}
		}
		return -1;
	}

	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int min;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];

			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					temp = arr[j];
					arr[j] = min;
					arr[i] = temp;
					min = arr[i];
				}
			}
		}

		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
