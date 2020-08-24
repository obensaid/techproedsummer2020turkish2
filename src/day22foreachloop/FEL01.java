package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {
	public static void main(String[] args) {
		
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		//for each loop = Enhanced loop
		//for each loop arraylerde  kullanilmaz
		
		for (Integer w : il) {
			System.out.println(w);
		}
		//il listin tum elemanlarini toplayiniz
		int sum = 0;
		for (Integer w : il) {
			sum=sum+w;
		}
		
		System.out.println(sum);
		
		//il list inin icindeki tek sayi olan sayilarin carpimini  bulunuz
		int product = 1;
				for (Integer w : il) {
				if (w%2!=0) {
					product=product*w;
				}
			}
		
				System.out.println(product);
				
				//il list inin icindeki tek sayi olan sayilari  yazdiriniz
			for (Integer w : il) {
				if (w%2!=0) {
					System.out.println("==="+w+"---");
				}
			}
			System.out.println();
		//Break ve continue karsilstirilmasi
			//illlistinin ilk uc elemanini yazdiriniz
			//1.yol
			int count = 0;
			for (Integer w : il) {
			if (count<3) {
					System.out.print("-----"+w+" ");
					count++;
				}
			}
			System.out.println();
			//2.yol
			int c=0;
			for (Integer w : il) {
				System.out.print("====="+w+" ");
				c++;
				if (c==3) {
					break;
				}
			}
			System.out.println();
		//il listin de 3 ile boluneni ekrana yaziniz
			//1.yol
			for (Integer w : il) {
				if (w%3==0) {
					System.out.print(w+" - ");
				}
				
			}
			System.out.println();
			//2.yol
			//continue kullanirken if kullanmissak else  ye gerek yok
			for (Integer w : il) {
				if (w%3!=0) {
					continue;
				}else {
					System.out.print(w+" ");
				}
			}
			
			
	}

}
