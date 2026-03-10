package array;

public class rotateelementsbyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=3;
		int n=arr.length;	
		for(int i=0;i<k;i++) {
			int first=arr[0];
			for (int j = 0; j < n-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[n-1]=first;	
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
