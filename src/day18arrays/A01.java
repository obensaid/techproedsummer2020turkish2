package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		//bir array i cosola yazdirmak icin Arrays.toString() kullaniriz
		int arr1 [] = new int[3];
		System.out.println(Arrays.toString(arr1));
		
		//Bir  array e elaman ekleme
		//Array ler stringler gibi index kullanir.
		//Bir array de olmayanindexi kullanmaya calisirsaniz compile time error degil 
		//run time  error alirsiniz.yani ;kodu calistirdiktan onra console da 
		//kirmizi hata mesaji gorursunuz.Kodu yazarken kirmizi alt cizgi almazsiniz
		//ornegin; arr1[3]=13; kodu calistiktan sonra"ArrayIndexOutOfBoundsException" hatasi verir
		
		arr1 [2]=11;
		System.out.println(Arrays.toString(arr1));
		arr1 [1]=9;
		System.out.println(Arrays.toString(arr1));
		arr1 [0]=7;
		System.out.println(Arrays.toString(arr1));
		
		//kisa yoldan array olusturup deger atama
		int arr2 [] = {8, 10, 12, 14, 27, 1453};
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[arr2.length-1]);//soneleman her zaman array ismi[lenght-1]
		
		//bir array olusturun tum elemanlarini for loopkullanarak ekrana ayni satirda aralarina boluk  koyarakyazdirin
		
		int arr3 [] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
			//bir array olusturunuz bu arrayin indexi cift sayi olan elemanlarini while loop
			//kullanarak ekrana ayni satirda ve aralarina bosluk koyarak yaziniz
			System.out.println("===============");
			int arr4[]= {1,2,3,4,5,6,7,8,9,10};
			
			
			int i=0;
			while (i<arr4.length) {
				if (i%2==0) {
				System.out.print(arr4[i]+" ");	
				}
				i++;
			}
			
		
				
	}
}


