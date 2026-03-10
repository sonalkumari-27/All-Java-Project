package model;

public class BikeRental extends VehicleRental {
	public BikeRental(int vehicleId , String customerName , double vehicleCharge) {
		super(vehicleId,customerName , vehicleCharge);
	}
	public double calculateCharge() {
		return getVehicleCharge();
	}
}
