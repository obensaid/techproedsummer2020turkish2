package day13dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir String alin
		 String'in icinde 'a' varsa ekrana "Kazandiniz" yazdirin
		 'a' yoksa ekrana "Kaybettiniz" yazdirin ve yeni String isteyin
		 */

Scanner scan = new Scanner(System.in);
		
		String s = "a";
		do { if (!s.contains("a")) {
			System.out.println("Kaybettiniz");
			
		}
			
			System.out.println("bir soz yazin");
			s = scan.nextLine();
			if (!s.contains("a")) {
				
			}
		} while (!s.contains("a"));
		System.out.println("Kazandiniz");
		scan.close();
	}

}
