package activities;

public class CustomException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4877599888124556228L;
	private String message = null;
	
	public CustomException(String message)
	{
		this.message = message;
	}
	
	@Override
	
	public String getMessage()
	
	{
		return message;
	}
	

}
