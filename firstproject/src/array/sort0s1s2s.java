package array;

public class sort0s1s2s {
	public static void sort012(int[] arr) {
	    int low = 0, mid = 0, high = arr.length - 1;
	 
	    while (mid <= high) {
	        if (arr[mid] == 0) {
	            swap(arr, low, mid);
	            low++;
	            mid++;
	        } 
	        else if (arr[mid] == 1) {
	            mid++;
	        } 
	        else {
	            swap(arr, mid, high);
	            high--;
	        }
	    }
	}
	 
	static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	public static void main(String args[]) {
		int arr [] = {0,2,0,1,1,0,2,2,1,2,1,1,0,0};
				sort012(arr);
		System.out.println("sorted array : " );
				 for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
	}
}
