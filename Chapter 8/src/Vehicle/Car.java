package Vehicle;

public class Car extends Vehicle {
	
	public Car(double fec, double feh, double sc, double cv)
	{
		super(fec, feh, sc, cv);
	}
	
	public void dispCarInfo()
	{
		System.out.println("Car fuel economy city: " + getFuelEconomyCity() + "klm");
		System.out.println("Car fuel economy highway:" + getFuelEconomyHwy() + "klm");
		System.out.println("Car seating capacity:" + getSeatingCapacity());
		System.out.println("Car cargo capacity:" + getCargoVolume() + " cubic feet");
	}
	
	public static void main(String[] args) {
        Car user = new Car(13.5, 15, 5, 13.1);
        user.dispCarInfo();
    }

}//
