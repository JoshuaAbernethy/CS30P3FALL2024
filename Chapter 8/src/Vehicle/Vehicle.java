package Vehicle;

public abstract class Vehicle 
{
	
	protected String fuelEconomyCity;
	protected String fuelEconomyHwy;
	protected double seatingCapacity;
	protected double cargoVolume;

	public Vehicle(String fec, String feh, double sc, double cv)
	{
	fuelEconomyCity = fec;
	fuelEconomyHwy = feh;
	seatingCapacity = sc;
	cargoVolume = cv;
	}
	public String getFuelEconomyCity()
	{
		return fuelEconomyCity;
	}
	public String fetFuelEconomyHwy()
	{
		return fuelEconomyHwy;
	}
	public double getSeatingCapacity()
	{
		return seatingCapacity;
	}
	public double getCargoVolume()
	{
		return cargoVolume;
	}
}
