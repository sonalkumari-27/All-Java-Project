package stack;

public class myStack {
	    private int arr[];
	    private int capacity;
	    private int top;
	    public myStack(int cap) {
	        capacity = cap;
	        arr = new int[capacity];
	        top = -1;
	    }
	        public static void main(String[] args) {
	            myStack s = new myStack(90);
	            System.out.println("Stack initialized with size 5");
	        }
	    }
