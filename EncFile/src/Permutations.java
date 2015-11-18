
public class Permutations {

	public static void main(String[] args) {
		
		
		String str = "abcdefg";
		
		permutation("", str);
	}
	
	
	static String permutation(String end, String start){
		int n= start.length();
		if(n==0){
			System.out.println(end);
		}
		
		else{
			for(int i=0;i<start.length();i++){
				permutation(end + start.charAt(i), start.substring(0,i ) + start.substring(i+1,n));
			}
		}
		
		return null;
	}
	
}
