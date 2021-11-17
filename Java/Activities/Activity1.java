package activities;

public class Activity1 
{
	public static void main(String []args)
	{
		Car Thar = new Car();
		
		Thar.make = 2014;
		Thar.Color = "Red";
		Thar.Transmission = "Manual";
		
		Thar.displaycharacteristics();
		Thar.accelerate();
		Thar.breake();
		
	}

}

