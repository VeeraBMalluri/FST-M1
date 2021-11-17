package activities;

public class Activity3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double seconds = 1000000000;
		
		double earth = 31557600;
		double mercury = 0.2408467;
		double venus = 0.61519726;
		double mars = 1.8808158;
		double jupiter = 11.862615;
		double saturn = 29.447498;
		double uranus = 84.016846;
		double neptune = 164.79132;
		
		double age = (seconds/earth);
		System.out.println("age on earth years " + age);
		System.out.println("age on mercury years " + age*mercury);
		System.out.println("age on venus years " + age*venus);
		System.out.println("age on mars years " + age*mars);
		System.out.println("age on jupiter years " + age*jupiter);
		System.out.println("age on saturn years " + age*saturn);
		System.out.println("age on uranus years " + age*uranus);
		System.out.println("age on neptune years " + age*neptune);
	}

}
