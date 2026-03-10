package ObjectMethods;

public class test {
	public static void main(String[] args)throws Expection{
		Employee e1 = new Employee(101);
		Employee e2 = (Employee)e1.clone();
		System.out.println(e1.id + " "+ e2.id);
	}

}
