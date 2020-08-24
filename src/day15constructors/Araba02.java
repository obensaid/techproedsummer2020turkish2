package day15constructors;

public class Araba02 {
	int yil = 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba02(String model, int fiyat){		
		this.model = model;		
		this.fiyat = fiyat;	
	}
	
	Araba02(){
		
	}
	
	Araba02(String marka, String model, int yil, int fiyat){
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
	}

	public static void main(String[] args) {
		
		Araba02 a1 = new Araba02();
		System.out.println("Fiyat: " + a1.fiyat);//20000
		System.out.println("Marka: " + a1.marka);//Toyota
		System.out.println("Model: " + a1.model);//Rav4
		System.out.println("Yil: " + a1.yil);//2019
		a1.hizlanma(9);//9sn'de 100km/sa e ulasir
		a1.tuketim();
		
		System.out.println("=======================");
		
		Araba02 a2 = new Araba02("Corolla", 12000);
		System.out.println("Fiyat: " + a2.fiyat);//12000
		System.out.println("Marka: " + a2.marka);//Toyota
		System.out.println("Model: " + a2.model);//Corolla
		System.out.println("Yil: " + a2.yil);//2019
		a2.hizlanma(7);//7sn'de 100km/sa e ulasir
		a2.tuketim();
		
		//Arabanin fiyat, marka, model ve yil'ini degistirebilen bir constructor uretiniz
		//Sonra da bir obje uretip istediginiz bir araba olusturunuz.
		System.out.println("=======================");
		Araba02 a3 = new Araba02("Audi", "R8", 2020, 50000);
		System.out.println("Fiyat: " + a3.fiyat);//50000
		System.out.println("Marka: " + a3.marka);//Audi
		System.out.println("Model: " + a3.model);//R8
		System.out.println("Yil: " + a3.yil);//2020
		a2.hizlanma(3);//3sn'de 100km/sa e ulasir
		a2.tuketim();
		
	}
	
	public void hizlanma(int i) {
		System.out.println(i + "sn'de 100km/sa e ulasir");
	}
	
	public void tuketim() {
		System.out.println("km'de 0.1 dolar yakar");
	}

}