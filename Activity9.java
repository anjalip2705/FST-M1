package Activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Anjali");
		myList.add("Patel");
		myList.add("Kunal");
		myList.add("Chavda");
		myList.add("Naruto");
		
		for(String s: myList) {
			System.out.println(s);
		}
		
		System.out.println(myList.get(3));
		System.out.println(myList.contains("Hinata"));
		System.out.println("Original size" + " " + myList.size());
		myList.remove(1);
		System.out.println("After deleting" + " " + myList.size());
	}

}
