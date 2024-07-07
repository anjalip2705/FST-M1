package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet<>();
		hs.add("Naruto");
		hs.add("Hinata");
		hs.add("Sasuke");
		hs.add("Sakura");
		hs.add("Kakashi");
		hs.add("Itachi");
		
		System.out.println("Size of hs: " + hs.size());
		System.out.println("Removing an element: " + hs.remove("Sakura"));
		System.out.println("Adding an element: " + hs.add("Jiraiya"));
		System.out.println("Removing an element: " + hs.remove("Sakura"));
		System.out.println("Checking if an element is present: " + hs.contains("Hinata"));
		System.out.println("Updated set: " + hs);
		
		
	}

}
