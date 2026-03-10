package array;

public class varargs {
	public static void main(String[] args) {
		System.out.println("start");
		//varArgs();
		varArgs(1);
		//varArgs(1,2,3);
		System.out.println("end");
	}
	public static void varArgs(double...d) {
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
}

