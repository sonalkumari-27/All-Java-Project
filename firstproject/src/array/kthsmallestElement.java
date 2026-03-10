package array;

import java.util.PriorityQueue;

public class kthsmallestElement {
	public  static int kthSmallest(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
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
		int k = 4;
		System.out.println(kthSmallest(arr,k));
	}
}
