package activities;

public class Activity8 
{
	static void exceptionTest(String str) throws CustomException 
	{
        if(str == null) 
        {
            throw new CustomException("String value is null");
        } 
        else 
        {
            System.out.println(str);
        }
    }
	
    public static void main(String[] args)
    {
        try 
        {
            
            Activity8.exceptionTest("Will print to console");
            
            Activity8.exceptionTest(null); 
            Activity8.exceptionTest("Won't execute");
        } 
        catch(CustomException msg) 
        {
            System.out.println("Inside catch block: " + msg.getMessage());
        }
    }

    
}
	
    
	

