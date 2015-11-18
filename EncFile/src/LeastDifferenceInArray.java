import java.util.Arrays;

public class LeastDifferenceInArray {

	public static void main(String[] args) {

		int[] a = { 2, 5, 64, 1, 55 };

		int count = a.length;
		int diff = 999;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {

				} else {
					if (diff > a[i] - a[j] && (a[i] - a[j]) > 0)
						diff = a[i] - a[j];

				}

			}

		}
		System.out.println("Smallest Diff: " + diff);

		// FasterMethod:
		diff = 999;
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (diff > Math.abs(a[i] - a[i + 1]))
				diff = Math.abs(a[i] - a[i + 1]);

		}
		System.out.println("Faster Method, Sort-> then absDiff, then update " + diff);
	}

}
