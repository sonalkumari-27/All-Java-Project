package array;

public class sortedArray {
	public static void main(String args[]) {
		int arr[] = {1,2,6,4,5};
		boolean sort =true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				sort  = false;
				break;
			}
		}
		System.out.println(sort ? "Sorted array" :"not sorted array");
	}

}
