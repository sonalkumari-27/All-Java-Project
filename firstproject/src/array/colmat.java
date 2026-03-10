package array;
import java.util.Scanner;
public class colmat {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter number of rows: ");
		        int rows = sc.nextInt();
		        int cols = 1; 
		        int matrix[][] = new int[rows][cols];
		        System.out.println("Enter elements:");
		        for (int i = 0; i < rows; i++) {
		            matrix[i][0] = sc.nextInt();
		        }
		        if (cols == 1) {
		            System.out.println("It is a Column Matrix");
		        } else {
		            System.out.println("It is NOT a Column Matrix");
		        }
		    }
		}// TODO Auto-generated method stub

