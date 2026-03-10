package string;
import java.util.Scanner;
public class countvowelsandcons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.nextLine();
		int vowels=0,consonants=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u') {
			vowels++;
		}else consonants++;
		// TODO Auto-generated method stub
	}
		System.out.println("vowels :" +vowels);
		System.out.println("consonants :" +consonants);

	}
}
