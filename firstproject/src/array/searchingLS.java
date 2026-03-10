package array;
import java.sql.SQLOutput;
import java.util.Scanner;
public class searchingLS {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arr[] = {1,2,3,4,5};
	System.out.println("Enter the element : ");
	int n = sc.nextInt();
	int b = 0;
	for(int i =0;i<arr.length;i++) {
		if(arr[i] == n) {
			b=1;
			System.out.println("Element found at the " + i +" position");
			break;
		}
	}
	}
}
