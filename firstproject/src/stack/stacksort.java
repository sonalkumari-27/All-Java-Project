package stack;

public class stacksort {
	public static int [] arr (int a[],int x){
		int b[]=new int[a.length+1];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<x) {
				b[j]=a[i];
			}else if(a[i]==x) {
				b[j]=a[i];
			}else b[j+1]=a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a[] = {101,105,110,120,130};
		int x=105;
		int result[]=arr(a,x);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
