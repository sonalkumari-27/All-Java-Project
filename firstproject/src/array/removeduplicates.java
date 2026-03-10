package array;
import java.util.Arrays;
public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,4,3};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1])
				System.out.println(arr[i]);
			}
		System.out.println(arr[arr.length - 1]);
		}
	}

