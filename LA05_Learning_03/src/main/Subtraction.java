package main;

import java.util.Random;
import java.util.Scanner;

public class Subtraction {

	public Subtraction() {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int angka1 = rand.nextInt(100); 
		int angka2 = rand.nextInt(100);
		
		int sum = 0;
		if(angka1 >= angka2) {
			sum = angka1 - angka2;
			System.out.println("Berapa " + angka1 + " - " + angka2);
		}else if (angka2 >= angka1){
			sum = angka2 - angka1;
			System.out.println("Berapa " + angka2 + " - " + angka1);
		}
		
		int jwb;
		jwb = scan.nextInt();
		
		if(jwb == sum) {
			System.out.println("Jawaban benar");
		}else {
			System.out.println("Jawaban salah, jawaban yang benar: " + sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Subtraction();
	}

}
