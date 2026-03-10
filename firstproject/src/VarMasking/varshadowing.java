package VarMasking;

public class varshadowing {
	int x=10;
	void show() {
	int x=20;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String agrs[]) {
		varshadowing obj = new varshadowing(); 
        obj.show();
	}
}