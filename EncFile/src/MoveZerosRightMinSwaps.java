public class MoveZerosRightMinSwaps {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 5, 0, 6, 0, 2, 0, 4 };
		int count = arr.length - 1;

		for (int a : arr)
			System.out.print(a + " ");

		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == 0 && arr[count] != 0) {
				arr[i] = arr[count];
				arr[count] = 0;
				count--;
			} else {
				if (arr[i] != 0)
					i++;
				if (arr[count] == 0)
					continue;

			}

		}
		for (int a : arr)
			System.out.println(a);
	}
}
