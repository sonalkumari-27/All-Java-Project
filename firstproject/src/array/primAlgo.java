package array;
import java.util.HashMap;
import java.util.HashSet;
public class primAlgo {
	public static void main(String args[]) {
	HashMap<Integer, String> map  = new HashMap<>();
	map.put(1,"sonal");
	map.put(2,"kumari");
	System.out.println(map);
		HashSet<Integer> set = new HashSet<>();
		set.add(123);
		set.add(456);
		set.remove(123);
		set.contains(1);
		System.out.println(set);
	}
}
