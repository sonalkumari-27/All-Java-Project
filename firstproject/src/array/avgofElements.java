package array;

import java.util.Scanner;

public class avgofElements {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter array size");
				int n = sc.nextInt();
				int arr[] = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
		int sum=0;
		for (int i = 0; i <n; i++) {
			sum=sum+arr[i];
		}
		int avg = sum/n;
		System.out.println("Average of elements of an array is : " + avg);
		}
	}
