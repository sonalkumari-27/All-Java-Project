package string;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a word");
	        String s = sc.nextLine();

	        for (int i = s.length() - 1; i >= 0; i--) {
	            System.out.print(s.charAt(i));
	        }// TODO Auto-generated method stub

	}

}
