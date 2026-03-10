package main;
import model.BikeRental;
import repository.RentalRepo;
public class Driver {
	public static void main(String args[]) {
	RentalRepo repo = new RentalRepo();
	BikeRental bikerental = new BikeRental(123,"sonal",1200.09);
	repo.setVehicleList(bikerental);
	System.out.println(repo.getVehicleList().get(0).getVehicleId());
	System.out.println(repo.getVehicleList().get(0).getCustomerName());
	System.out.println(repo.getVehicleList().get(0).getVehicleCharge());
	}
}
