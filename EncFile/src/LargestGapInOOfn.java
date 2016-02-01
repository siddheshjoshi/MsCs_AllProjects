import java.util.Arrays;

public class LargestGapInOOfn {

	public static void main(String[] args) {

		int a[] = { 1, 33, 5, 56, 12, 66, 2, 3, 1123 };

		checkLargestGap(a);

	}

	public static void checkLargestGap(int[] A) {

		
		    int N = A.length;
		    if (N < 1);

		    int max = 0;
		    int result = 0;

		    for(int i = N-1; i >= 0; --i)
		    {
		        if(A[i] > max)
		            max = A[i];

		        int tmpResult = Math.abs(max - A[i]);        
		        if(tmpResult > result)
		            result = tmpResult;
		    }

		    System.out.println(result);

	}

}
