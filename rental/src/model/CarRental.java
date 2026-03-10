package model;

public class CarRental extends VehicleRental {
	public CarRental(int vehicleId , String customerName , double vehicleCharge) {
		super(vehicleId, customerName, vehicleCharge);
	}
	public double calculateCharge() {
		return getVehicleCharge();
	}
}
