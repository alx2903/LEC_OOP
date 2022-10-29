package main;

import java.util.Vector;

public class vector {

	public vector() {
		// TODO Auto-generated constructor stub
		Vector<Integer> vec = new Vector<>();
		
		vec.add(10);
		vec.add(5);
		vec.add(8);
		vec.add(7);
		
		System.out.println(vec.elementAt(0));
		
		for (Integer i : vec) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new vector();
	}

}
