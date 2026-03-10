package array;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
	public static int kthLargest(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int num : arr) {
			pq.add(num);
		}
		int ans=-1;
		for (int i = 0; i < k; i++) {
			ans=pq.poll();
		}
		return ans;
	}
	public static void main(String args[]) {
		int arr[] = {1,4,5,8,3,9};
		int k = 3;
		System.out.println(kthLargest(arr,k));
	}
}
