package ObjectMethods;

public class Employee implements Cloneable {
	int id;
Employee(int id){
	this.id=id;
}
protected Object clone() throws CloneNotSupportedExpection{
	return super.clone();
}
}
