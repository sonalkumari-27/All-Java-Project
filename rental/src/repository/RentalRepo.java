package repository;

import java.util.ArrayList;

import model.BikeRental;
import model.CarRental;
import model.VehicleRental;

public class RentalRepo {
	private static ArrayList<VehicleRental> vehicleList = new ArrayList<>();

	public ArrayList<VehicleRental> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(BikeRental bikeRental) {
		VehicleRental vehicleRent = new BikeRental(bikeRental.getVehicleId(),bikeRental.getCustomerName(), bikeRental.getVehicleCharge());
		vehicleList.add(vehicleRent);
	
	}
	public void setVehicleList(CarRental carRental) {
		vehicleList.add((VehicleRental)carRental);
	}
}
