package basics;

public class recursionstar {
		public static void main(String[] args) {
			starprinter(5);
		}
		public static void starprinter(int count) {
			System.out.println("*");
			starprinter(count);
			}
	}
