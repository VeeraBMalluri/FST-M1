package activities;

public abstract class Book 
{
	String title;
	abstract void settitle(String a);
	void gettitle() 
	{
		System.out.println("The title of the book is " + title);
	}
	
	
}
