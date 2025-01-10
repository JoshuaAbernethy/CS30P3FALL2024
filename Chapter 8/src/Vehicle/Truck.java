package Vehicle;

public class Truck extends Vehicle {
	public Truck(double fec, double feh, double sc, double cv)
	{
		super(fec, feh, sc, cv);
	}
	
	public void dispTruckInfo()
	{
		System.out.println("Truck fuel economy city: " + getFuelEconomyCity() + "kpl");
		System.out.println("Truck fuel economy highway:" + getFuelEconomyHwy() + "kpl");
		System.out.println("Truck seating capacity:" + getSeatingCapacity());
		System.out.println("Truck cargo capacity:" + getCargoVolume()+ " cubic feet");
	}
	
	public static void main(String[] args) {
        // Now you create a valid Output object with all parameters
       Truck user1 = new Truck(18, 20, 5, 100);
       user1.dispTruckInfo();
    }//

}
