/**
 * 
 */
package assignment;

/**
 * @author rucha.joshi
 *
 */
public class Carpool {

	/**
	 * @param args
	 * car-pool 
	 */
	public static void main(String[] args) {
		// Declare variables
		
		int cars = 100;
		int drivers = 30;
		int passengers = 90;
		double spaceInACar = 4.0;
		double averageMilesDriven = 29.2;
		double averageMilesPerGallon = 23.6;
		double gasCostPerGallon = 2.517;
		int carsNotDriven;
		int carsDriven;
		double carpoolCapacity;
		double averagePassengersPerCar;
		double moneySaved;
		double gasCostPerTrip;
		
		carsNotDriven = cars - drivers;
		carsDriven = drivers;
		carpoolCapacity = carsDriven * spaceInACar;
		averagePassengersPerCar = passengers/carsDriven;
		gasCostPerTrip = (averageMilesDriven * gasCostPerGallon)/averageMilesPerGallon;
		moneySaved = (gasCostPerTrip * cars) - (gasCostPerTrip * carsDriven);
		
		System.out.println("There are " + cars + " cars available.\r\n" + 
				"There are only " + drivers + " drivers available.\r\n" + 
				"That means there will be " + carsNotDriven + " empty cars today!\r\n" + 
				"We can transport " + carpoolCapacity + " people today.\r\n" + 
				"Out of that, we're transporting " + passengers + " today.\r\n" + 
				"So we'll need to put about " + averagePassengersPerCar + " in each car.\r\n" + 
				"Long story short, today, we'll be saving about $" + moneySaved +  "!");
	}

}
