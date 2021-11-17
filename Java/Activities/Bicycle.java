package activities;

public class Bicycle implements BicycleOps, BicycleParts
{
	 	public int gears;
	    public int speed;

	   
	    public Bicycle(int gears, int speed) 
	    {
	        this.gears = gears;
	        this.speed = speed;
	    }

	   
	    public void applybrake(int decrement) 
	    {
	    	speed -= decrement;
	        System.out.println("Current speed: " + speed);
	    }

	    public void speedup(int increment) 
	    {
	    	speed += increment;
	        System.out.println("Current speed: " + speed);
	    }

	    
	    public String bicycleDesc() 
	    {
	        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
	    }
}
