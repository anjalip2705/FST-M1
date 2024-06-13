package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<Integer, String> colours = new HashMap<Integer, String>();
	colours.put(1, "Yellow");
	colours.put(2, "Black");
	colours.put(3, "White");
	colours.put(4, "Brown");
	colours.put(5, "Purple");
	
	System.out.println("Map: " + colours.entrySet());
	System.out.println("Removing element: " + colours.remove(4));
	System.out.println("Checking if green is present: " + colours.containsValue("green"));
	System.out.println("Size of map: " + colours.size());
	
	}

}
