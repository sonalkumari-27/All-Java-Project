package method_overloading;

public class FamilyDriver {
	public static void main(String [] args) {
		Parent p=new Parent();
		p.printNum(1);
		Child c = new Child();
		c.printNum(0);
		c.printNum(0,0);
	}
}

