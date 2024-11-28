package Vehicle;

public abstract class Vehicle 
{
	protected double fuelEconomyCity;
	protected double fuelEconomyHwy;
	protected double seatingCapacity;
	protected double cargoVolume;

	public Vehicle(double fec, double feh, double sc, double cv)
	{
	fuelEconomyCity = fec;
	fuelEconomyHwy = feh;
	seatingCapacity = sc;
	cargoVolume = cv;
	}
	public double getFuelEconomyCity()
	{
		return fuelEconomyCity;
	}
	public double getFuelEconomyHwy()
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
	public void setFuelEconomyCity(double fec)
	{
		fuelEconomyCity = fec;
	}
	public void setFuelEconomyHwy(double feh)
	{
		fuelEconomyHwy = feh;
	}
	public void setSeatingCapacity(double sc)
	{
		seatingCapacity = sc;
	}
	public void setcargoVolume(double cv)
	{
		cargoVolume = cv;
	}
	
	public String toString()
	{
		return("Fuel Economy in city: " + fuelEconomyCity + ". Fuel economy highway: " + fuelEconomyHwy + ". Seating capacity: " + seatingCapacity + ". Cargo volume: " + cargoVolume);
	}
}
