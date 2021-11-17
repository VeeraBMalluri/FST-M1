package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> hash_map = new HashMap<Integer, String>();
        
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Blue");
        hash_map.put(4, "White");
        hash_map.put(5, "Black");

        System.out.println("The map keys and values are : " + hash_map);
        
        hash_map.remove(3);
        
        System.out.println("After removing key 3: " + hash_map);
        
        System.out.println("Is the colour green exists in map :" + hash_map.containsValue("Green"));
        
             
       System.out.println("Number of key value pairs in the Map is: " + hash_map.size());
    }
}