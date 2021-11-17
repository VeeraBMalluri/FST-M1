package activities;

import java.util.ArrayList;
//import java.util.List;

public class Lambdaex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Franklin");
		names.add("John");
		names.add("Mark");
		names.add("Edaward");
		names.add("James");
		
		names.forEach((name) -> System.out.println(name));
	}

}
