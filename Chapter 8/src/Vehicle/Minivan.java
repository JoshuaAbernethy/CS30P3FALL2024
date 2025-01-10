package Vehicle;

public class Minivan extends Vehicle{
	public Minivan(double fec, double feh, double sc, double cv)
	{
		super(fec, feh, sc, cv);
	}
	
	public void dispMinivanInfo()
	{
		System.out.println("Minivan fuel economy city: " + getFuelEconomyCity() + "kpl");
		System.out.println("Minivan fuel economy highway:" + getFuelEconomyHwy() + "kpl");
		System.out.println("Minivan seating capacity:" + getSeatingCapacity());
		System.out.println("Minivan cargo capacity:" + getCargoVolume()+ " cubic feet");
	}
	
	public static void main(String[] args) {
        // Now you create a valid Output object with all parameters
       Minivan user2 = new Minivan(18, 20, 5, 100);
       user2.dispMinivanInfo();
    }

}
//