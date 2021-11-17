package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 
{
    public static void main(String[] args) 
    {
        
        List<String> myList1 = new ArrayList<String>();
        
        myList1.add("Veera");
        myList1.add("Kala");
        myList1.add("Malluri");
        myList1.add("Siva");
        myList1.add("Brahma");
        
        int i=0;    
        System.out.println("All names listed below :");
        
        for(String s:myList1)
        {
        	
        	
            System.out.println("name"+i + " : " +s);
            
            i++;
        }
        
        System.out.println("3rd name in my list is: " + myList1.get(2));
        
        System.out.println("Is Siva name in my list: " + myList1.contains("Siva"));
        
        System.out.println("Size of ArrayList: " + myList1.size());
        
        myList1.remove("Siva");
        
        System.out.println("New Size of ArrayList: " + myList1.size());
    }
}
