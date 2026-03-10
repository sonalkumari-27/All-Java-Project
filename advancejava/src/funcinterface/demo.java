package funcinterface;
import java.util.function.Function;
	public class demo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Function<Integer,Double> f= (n)-> Math.sqrt(n);
			System.out.println(f.apply(4));
			Function<Integer,Double> f2= Math::sqrt;
			System.out.println(f2.apply(16));
		}

	}
