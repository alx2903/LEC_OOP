package main;

import java.util.ArrayList;

public class arraylist {

	public arraylist() {
		// TODO Auto-generated constructor stub
		// Deklarasi ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		
		ArrayList<String> cars2 = new ArrayList<>();
		
		cars2.add("Toyota");
		cars2.add("Honda");
		cars2.add("Mazda");
		cars2.add("Lexus");
		
		System.out.println(cars2.get(1));
		
		System.out.println(cars2.isEmpty());
		
		cars2.remove(0);
		
		for (String i : cars2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new arraylist();
	}

}
