
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(search(arr, 5));
		System.out.println(search(arr, 6));
	}

	public static int search(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) return i;
		}
		return -1;
	}
}
