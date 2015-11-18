import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class HashMapTest {

static	Set<Integer> s = new LinkedHashSet<Integer>();
 public static void main(String[] args) {
Random r = new Random();

for(int i=0;i<3000000;i++){
	addtoSet(r.nextInt(3000000));
}
 		
 		System.out.println(s.iterator().next());
	}
	
	
	public static void addtoSet(Integer str){
		if(s.contains(str))
			s.remove(str);
		else
			s.add(str);
	}

}
