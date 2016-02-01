import java.util.HashMap;

public class PalindromeCheck {

	public static void main(String[] args) {

		String driver = "abcaa2cba";

		boolean flag = isPalindrome(driver);
		System.out.println(flag);
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "apple");
		hm.put(1, "orange");
		
		System.out.println("---------------");
		System.out.println();

	}

	private static boolean isPalindrome(String driver) { //o(n/2)

		char[] t = driver.toCharArray();
		int ptr = t.length -1;
		boolean flag = false;
		for (int i = 0; i < t.length/2; i++) {
			
			if(t[i] == t[ptr]){
				
				flag = true;
			}else{
				flag = false;
			}
			ptr--;
		}
		return flag;
	}

}
