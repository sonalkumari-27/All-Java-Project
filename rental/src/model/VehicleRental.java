package model;

public abstract class VehicleRental {
	private int vehicleId;
	private String customerName;
	private double vehicleCharge;
	public int getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getVehicleCharge() {
		return this.vehicleCharge;
	} 
	public void setVehicleCharge(double vehicleCharge) {
		this.vehicleCharge = vehicleCharge;
	}
	public abstract double calculateCharge();
	public VehicleRental(int vehicleId , String customerName , double vehicleCharge) {
		this.vehicleId = vehicleId;
		this.customerName = customerName;
		this.vehicleCharge = vehicleCharge;
	}
}
