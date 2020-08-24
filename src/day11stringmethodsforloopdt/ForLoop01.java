package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {

		//loop dongu demek tekrar tekrar yapmaya denir
		//ekrana 10 defa java ayazdiralim
		/*System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		*/
		//yukaridaki isi forloop kullanarak kisaca yazabiriz
		//Baslangic Condition Artirma/Azaltma
		
		for (int i =1; i<=10 ; i++) {
			System.out.println("java");
		}
		
		//ekrana 1 den 7 ye kadar olan tam sayilari yazdiriniz
		
		for(int s =1; s<=7 ; s++) {
			System.out.println(s);
		}
		
		//ekrana 4 ten 1 kadar yazdirin
		
		for(int i =4; i>=1 ; i--) {
			System.out.println(i);	
		}
		
		
		//ekrana ilk uc cift sayma sayisini yazdiriniz
		//1.yol
		for (int i = 2; i<=6 ; i+=2) {
			System.out.println(i);
		}
		
		//2.yol
		for (int i =1; i<=6; i++) {
			if(i%2==0) {
				System.out.println(i);	
			}
		}
		
		//ekrana ilk yuz cift yazma sayisini yazdiriniz
		//Loop'larin oncesinde bir variable olusturup onu loop'un icinde 
				//kullanirsaniz bu variable'lara "Flag" denir. Asagidaki soruda 
				//sayma variable'i bir flag'dir.
		int sayma = 0;
		for (int i = 1; sayma<=100; i++) {
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
