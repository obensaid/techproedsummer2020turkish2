package day17staticblock;

import java.nio.channels.Pipe;

public class Sb01 {
	//farzedin ki bu class  dairenin cevre ve alanini hesaplayacak
	//Alan = pi*r*r      Cevre = 2*pi*r
	//Bu glass ta pi sayisi her zaman kullanilacaaktir.
	//Pi sayisini class uretilirken deger atamasi yapmak faydallidir.
	//eger class uretilirken bazi variable lara deger atamasi isterseniz static block kullanmalisiniz.
	//static block icinde kullanilan hersey static olmalidir.
	//bu yuzden asagidaki pi variable ini statik yapmak zorundayiz
	//static block main method dan diger butun methodlardan ,butun constructor lardan once  calisir
	//static blockk class olusturulurken calisir
	static double pi;
	public Sb01() {
		System.out.println("Constructor");
	}
	static {
		pi = 3.14;
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Sb01 obj = new Sb01();
	}

}
