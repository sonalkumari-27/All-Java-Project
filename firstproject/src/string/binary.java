package string;
import java.util.Scanner;
public class binary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        boolean b = true;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != '0' && s.charAt(i) != '1') {
	                b = false;
	                break;
	            }
	        }

	        if (b)
	            System.out.println("Binary String");
	        else
	            System.out.println("Not a Binary String");
	    }
	}
