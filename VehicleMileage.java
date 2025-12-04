package com.codegnan.oopexamples;

import java.util.Scanner;

public class VehicleMileage {
		String vehicleNo;
	    String brand;
	    double fuelConsumed;
	    double distanceTravelled;
	    
	    
	public VehicleMileage() {
		this("Unknown","Unknown",0.0,0.0);
		}


	public VehicleMileage(String vehicleNo, String brand, double fuelConsumed, double distanceTravelled) {
			super();
			this.vehicleNo = vehicleNo;
			this.brand = brand;
			this.fuelConsumed = fuelConsumed;
			this.distanceTravelled = distanceTravelled;
		}

	public double calculateMileage() {
		return distanceTravelled/fuelConsumed;
	}

	public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Vehicle No: " + this.vehicleNo);
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Consumed: " + this.fuelConsumed);
        System.out.println("Distance Travelled: " + this.distanceTravelled);
        System.out.println("Mileage: " + this.calculateMileage() + " km/l");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String number=scanner.next();
		String brand=scanner.next();
		double fuel=scanner.nextDouble();
		double distance=scanner.nextDouble();
		
		VehicleMileage vm = new VehicleMileage(number, brand, fuel, distance);
		vm.displayDetails();
		scanner.close();
	}

}