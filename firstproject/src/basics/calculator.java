package basics;
import java.util.Scanner;
public class calculator {
		static void add(int a, int b) {
	        System.out.println("Add =" + (a + b));
	    }
	    static void subtract(int a, int b) {
	        System.out.println("Sub = " + (a - b));
	    }

	    static void multiply(int a, int b) {
	        System.out.println("Multiplication = " + (a * b));
	    }
	    static void divide(int a, int b) {
	        if (b == 0) {
	            System.out.println("Division by zero not possible");
	        } else {
	            System.out.println("Division = " + (a / b));
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int x = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int y = sc.nextInt();
	        System.out.println("Choose operation");
	        System.out.println("1. Add");
	        System.out.println("2. Subtract");
	        System.out.println("3. Multiply");
	        System.out.println("4. Divide");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                add(x, y);        
	                break;
	            case 2:
	                subtract(x, y);
	                break;
	            case 3:
	                multiply(x, y);  
	                break;
	            case 4:
	                divide(x, y);    
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        sc.close();
	    }
	}
