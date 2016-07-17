import java.util.HashSet;
import java.util.Set;

public class RepeatInArray {

	public static void main(String[] args) {

		int[] a = { 10, 3, 3, 1, 2, 3 };
		System.out.println("Program starts?");
		findDuplicates(a);

	}

	public static void findDuplicates(int[] a) {
		
		Set<Integer> hs = new HashSet<Integer>();
		System.out.println("Print: "+a[0]);
		hs.add(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (hs.contains(a[i])) {
				System.out.println("common element found: " + a[i]);
			} else {
				hs.add(a[i]);
			}
		}

	}
}
