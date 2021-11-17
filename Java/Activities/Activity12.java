package activities;

public class Activity12 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Addable ad1 = (a,b)-> a+b;
		
		System.out.println(ad1.addnum(10,50));
		
		Addable ad2 = (int a, int b) -> {return a+b;};
		
		System.out.println(ad2.addnum(10, 60));


	}
}