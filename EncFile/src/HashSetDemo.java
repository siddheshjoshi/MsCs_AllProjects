import java.util.*;

public class HashSetDemo {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 1, 3, 4, 5, 1, 3, 55 };

		// create a hash set
		LinkedHashSet hs = new LinkedHashSet();
		// add elements to the hash set
		for (int a : arr)
			hs.add(a);
		System.out.println(hs);
	}
}