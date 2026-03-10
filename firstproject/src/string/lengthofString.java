package string;

import java.util.Scanner;

public class lengthofString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.nextLine();
		int len=0;
		for(char ch : s.toCharArray()) {
			len++;
		}
		System.out.println("Length of an array:" + len);
// TODO Auto-generated method stub

	}

}
