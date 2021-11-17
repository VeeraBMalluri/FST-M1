package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
      
        hs.add("Veer");
        hs.add("Brahma");
        hs.add("Maa");
        hs.add("Amma");
        hs.add("Mom");
        hs.add("God");
        
     
        System.out.println("HashSet: " + hs);        
        
        System.out.println("length of HashSet: " + hs.size());
        

        System.out.println("Removing dog from HashSet: " + hs.remove("dog"));
        
              
        System.out.println("Checking if Mom is present: " + hs.contains("Mom"));
       
        System.out.println("Updated HashSet: " + hs);
    }
}