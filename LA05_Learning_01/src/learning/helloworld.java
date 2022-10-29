package learning;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int bilanganbulat = 10;
//		String bilanganbulat = "10";
		String namaSaya = "";
		int umur;
		
		System.out.println("Masukkan Nama Anda: ");
		
		Scanner input = new Scanner(System.in);
		namaSaya = input.nextLine();
		
		System.out.println("Selamat Pagi " + namaSaya);
		System.out.println();
		
		System.out.println("Masukkan Umur Anda: ");
		
		umur = input.nextInt();
		System.out.println("Umur Anda: " + umur);
		
//		System.out.println(bilanganbulat + bilanganbulat);
//		System.out.println(bilanganbulat + bilanganbulat);
//		System.out.println("Hello World");
//		System.out.println("ASCII 36 = " + (char)36);
//		System.out.println("ASCII 48 = " + (char)48);
		
		input.close();
	}

}
