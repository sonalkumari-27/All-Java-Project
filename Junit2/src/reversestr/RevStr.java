package reversestr;

public class RevStr {
		public static String reverse(String s) {
		String result="";
		for (int i = s.length()-1; i >= 0; i--) {
			result+=s.charAt(i);
		}
		return result;
	}
		public static void main(String args[]) {
			String s="sonal";
			System.out.println(reverse(s));
}
}
