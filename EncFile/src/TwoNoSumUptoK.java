public class TwoNoSumUptoK {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 6, 2, 4 };
		int k = 10;

		calcSum(arr, k);

	}

	private static void calcSum(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {

				}

				else {

					if (arr[i] + arr[j] == k) {
						System.out.println(arr[i] + " + " + arr[j] + "=" + k);
					}
				}

			}
		}

	}

}
