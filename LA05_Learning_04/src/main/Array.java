package main;

public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
		// Declare and Create Array in Java
		String[] backpack = {"Sabit", "Water Can", "Axe"};
		String[] backpack2 = {"Sabit", "Water Can", "Axe"};
		String[] myBackpack = new String[3];
		int[] myList = {1,2,13,7,5};
		
		// Access Array in Java
//		System.out.println(backpack[0]);
//		System.out.println(backpack2[1]);
//		System.out.println(myBackpack);
		
		// Array Size in Java
//		System.out.println(backpack.length);
//		System.out.println(myList.length);
		
		// Processing Array
			// Display all of array content
//		for (int i = 0; i < backpack.length; i++) {
//			System.out.println(backpack[i]);
//		}
		
			// Counting All the element array
//		int sum = 0;
//		for (int i = 0; i < myList.length; i++) {
//			sum+=myList[i];
//		}
//		System.out.println(sum);
		
			// Display the maximum value of array
//		int max = myList[0];
//		for (int i = 0; i < myList.length; i++) {
//			if(max<myList[i]) {
//				max = myList[i];
//			}
//		}
//		System.out.println(max);
		
			// For Each element of array
//		for (String i : backpack) {
//			System.out.println(i);
//		}
		
		// Copy Array Element
		int[] copyList = new int[5];
		for (int i = 0; i < myList.length; i++) {
			copyList[i] = myList[i];
		}
		for (int i : copyList) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array();
	}

}
