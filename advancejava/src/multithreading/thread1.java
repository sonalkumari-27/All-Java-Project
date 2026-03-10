package multithreading;
//	class MyThread extends Thread {
//	    public void run() {
//	        System.out.println("Thread is running");
//	    }
//	}
//	public class thread1 {
//	    public static void main(String[] args) {
//	        MyThread t1 = new MyThread();
//	        t1.start();   
//	    }
//	}
	class A  implements Runnable{
		public void run() {
			System.out.println("sonal");
		}
	}
	public class thread1 {
		public static void main(String args[]) {
			A a =new A();
			Thread t= new Thread(a);
			t.start();
		}
	}