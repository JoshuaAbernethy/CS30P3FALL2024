package Vehicle;

import Vehicle.Car;

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
		Car user = new Car(fec, feh, sc, cv);
		user.dispCarInfo();
		
		System.out.println();
		
		Truck user1 = new Truck(fec, feh, sc, cv);
		user1.dispTruckInfo();
		
		System.out.println();
		
		Minivan user2 = new Minivan(fec, feh, sc, cv);
		user2.dispMinivanInfo();
	}
}
