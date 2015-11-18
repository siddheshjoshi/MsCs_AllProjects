import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicSumToK {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int k = 5;

		List<Integer> myCoords = new ArrayList<Integer>();

		for (int a : arr) {
			myCoords.add(a);

		}

		boolean got = isSum(myCoords, k);

	}

	private static boolean isSum(List<Integer> myCoords, int k) {

		List<Integer> found = new ArrayList<Integer>();

		boolean flag = didGet(myCoords, k, found);
		return false;
	}

	private static boolean didGet(List<Integer> myCoords, int k,
			List<Integer> found) {

		int sum = 0;
		for (int i = 0; i < found.size(); i++) {
			sum += found.get(i);

		}
		
		if(sum == k)
			return true;
		else
		//	didGet()

		return false;
	}

}