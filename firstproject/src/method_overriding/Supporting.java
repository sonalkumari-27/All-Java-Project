package method_overriding;

public class Supporting  extends Employee{
	double varPay=100000;
	public double monthlySalcal() {
		return (basePay+varPay)/12;
	}

}
