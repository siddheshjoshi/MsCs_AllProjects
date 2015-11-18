
public class ArrayRotateByK {

	public static void main(String args[]) {

		int[] arr = { 1, 31, 20, 6, 55 };
		int k = 3;

		// Start logic

		swap(arr, 0, arr.length - 1);
		swap(arr, 0, arr.length - k - 1);
		swap(arr, arr.length - k, arr.length - 1);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static int[] swap(int[] arr, int start, int end) {
		int tempEnd = end;
		for (int i = start; i < ((end - start + 1) / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[tempEnd];
			arr[tempEnd--] = temp;

		}
		return arr;
	}
}
