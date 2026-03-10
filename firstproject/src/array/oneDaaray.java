package array;

public class oneDaaray {

	public static void main(String[] args) {
//		int arr1D[] = new int [10];
//		int arr2D[][] = new int[5][5];
//		for(int i=0; i<=arr1D.length;i++){
//			System.out.println(arr1D[i]);// TODO Auto-generated method stub
//		}
		int arr[] = {10,5,30,6,8,20};
//		int pos = 2;
//		int b[] = new int [arr.length+1];
//			for(int i=0; i<b.length;i++) {
//				if(i<pos) {
//					b[i]=arr[i];
//				}
//				else if (i == pos) {
//					b[2]=30;
//				}else {
//					b[i] = arr[i-1];
//				}
//			}
//			for (int j = 0; j < b.length; j++) {
//				System.out.println(b[j]);
//			}
//			int sop=2;
//			for(int i=0 ; i<arr.length;i++) {
//				if (i == sop) {
//					arr[i]=arr[i+1];
//				}else if(i>sop) {
//					arr[sop+1] = arr[i];
//				}
//			}
//			for (int j = 0; j < arr.length; j++) {
//				System.out.println(arr[j]);
//			}
		int k=3;
		int n=arr.length;
		int b[] = new int [arr.length];
		for (int i = 0; i < k; i++) {
			int b[i]= arr[k+i];
		}
		for (int j = k; j <arr.length; j++) {
			int b[j-k] = arr[j];
			
		}
		for (int u = 0; u < arr.length; u++) {
			System.out.println(arr[u]);
			
		}
		}
	}
