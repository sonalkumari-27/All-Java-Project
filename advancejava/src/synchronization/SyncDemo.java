package synchronization;
	class Demo implements Runnable{
		int count=0;
		public void show() {
			count++;
		}
		public void run() {
			for (int i = 0; i <500; i++) {
				show();
			}
		}
	}
	public class SyncDemo {
		public static void main(String args[]) {
			Demo d=new Demo();
			Thread t=new Thread(d);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(d.count);
			
		}
	}
