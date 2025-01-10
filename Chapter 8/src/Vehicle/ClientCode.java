package Vehicle;

//import Vehicle.Car;
//import Vehicle.Truck;
//import Vehicle.Minivan;

public class ClientCode extends Vehicle 
{
	static double fec;
	static double feh;
	static double sc;
	static double cv;
	
	public ClientCode(double fec, double feh, double sc, double cv) 
	{
		super(fec, feh, sc, cv);
	}
	
	public static void main(String[] args) 
	{
		Car user = new Car(13.5, 15, 5, 13.1); // fec, feh, sc, cv
		user.dispCarInfo();
		
		System.out.println();
		
		Truck user1 = new Truck(18, 20, 5, 100);
		user1.dispTruckInfo();
		
		System.out.println();
		
		Minivan user2 = new Minivan(18, 20, 5, 100);
		user2.dispMinivanInfo();
	}
}//
