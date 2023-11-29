package practice.com;

import java.util.HashMap;
import java.util.Map;

public class MapsUsage {
	public static void main(String[] args) {
		
	 Map<Integer, String> studentMap = new HashMap<>();
		  studentMap.put(101, "prasad");
		  studentMap.put(102, "Lokesh");
		  studentMap.put(103, "chethan");
		   System.out.println("Student Map:");
		   for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
		         System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
		        }

		   int searchId = 102;
		     if (studentMap.containsKey(searchId)) {
		       System.out.println("\nStudent ID " + searchId + " Exists in the map. Name: " + studentMap.get(searchId));
		        } else {
		            System.out.println("\nStudent ID " + searchId + " does not exist in the map.");
		        }
	}
}
