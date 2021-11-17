package activities;

public class Activity7 {

	public static void main(String[] args) 
	{
		MountainBike Fantom = new MountainBike( 5, 50, 10);
		
		System.out.println(Fantom.bicycleDesc());
		
		Fantom.speedup(10);
		Fantom.applybrake(5);
	}

}
