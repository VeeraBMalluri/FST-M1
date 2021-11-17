package activities;

import java.util.*;

public class Activity13 
{

    public static void main(String[] args) 
    {
    	try {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        
        System.out.print("Please Enter integers \t");
        
        System.out.println("(Enter non-integer to terminate): ");

        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        
        int index = indexGen.nextInt(nums.length);
        
        System.out.println("Index value generated: " + index);
        
        System.out.println("Value in arary at generated index: " + nums[index]);

        scan.close();
    	}
    	catch(Exception e) 
    	{
    		System.out.println("you should enter atleast one integer");
    	}
    }
}