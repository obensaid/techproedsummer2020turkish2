package day13dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {

		//kullanicidan bir sayi alin sayi cift sayiise kullanici ekrana kazandiniz yazdirin
		//sayi tek sayi ise ekrana kaybettiniz yazdirin ve yeni bir sayi istyin
		
		Scanner scan = new Scanner(System.in);
		
		int s = 20;	
		do {
			if (s%2!=0) {
				System.out.println("kaybettiniz");	
			}
			System.out.println("bir sayi giriniz");
			s = scan.nextInt();
			
			
		} while (s%2!=0);
		System.out.println("kazandiniz");
		scan.close();
	}

}
