package string;
import java.util.Scanner;
public class noofchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.nextLine();
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
