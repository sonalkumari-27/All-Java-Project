package funcinterface;
import java.util.function.Predicate;

	//public interface Draw {
//		void circle();
	//}
	//class c1 implements Draw {
//		public void circle() {
//			System.out.println("c1.Draw");
//		}
	//}
	//public class launch {
//				public static void main(String args[]) {
//					Draw d =()-> {System.out.println("c1.draw");};
//					d.circle();
//				}
//			}
	public class lambdaexp {
		public static void main(String args[]) {
	        Predicate<Integer> isEven = x -> x % 2 == 0;
	        Predicate<Integer> isPositive = x -> x > 0;

	        System.out.println(isEven.test(10));     // true
	        System.out.println(isPositive.test(-5)); // false
	    }
	}
