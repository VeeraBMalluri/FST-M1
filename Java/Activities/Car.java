package activities;

public class Car 
{
	String Color;
	String Transmission;
	int make;
	int tyres;
	int doors;
	
	Car()
		{
			tyres = 4;
			doors = 4;
		}
	void displaycharacteristics() 
	{
		System.out.println("The color of the car is " + Color);
		System.out.println("The car transmission type is " + Transmission);
		System.out.println("The no of tyres of the car is " + tyres);
		System.out.println("The car make year is " + make);
		System.out.println("The no of doors having the car is " + doors);
	}
	void accelerate()
	{
		System.out.println("Car is moving Forward");
	}
	
	void breake()
	{
		System.out.println("Car has stopped");
	}
}
