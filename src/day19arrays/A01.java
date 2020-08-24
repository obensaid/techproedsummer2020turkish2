package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

		int arr [] = {3,7,1,18};
		//Array elemanlarini kucukten buyuge siralayalim
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//bir string array olusturun elemanlarini alfabetik sirada dizin
		
		int arr1 []= {12,34,56,79,55};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//Bir integer aarray deki en buyuk ve en kucuk sayiyi ekrana yazdiran codu yziniz
		
		int arr0[]= {12,34,578,345,890,3};
		Arrays.sort(arr0);
		int arr2 []= {12,34,56,79,55};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		int arr3 []= {12,34,56,79,55};
		Arrays.sort(arr3);
		System.out.println("En kucuk sayi :"+ arr3[0]);
		System.out.println("En kucuk sayi :"+ arr3[arr3.length-1]);
		

		int  nrr[] = {2,1,7,3,5};
		//yukaridaki arrayde 7 elemaninin var olup olmadigini kontrol ediniz
		//1.yol loop ile
		int count = 0;
		for (int i = 0; i < nrr.length; i++) {
			if (nrr[i]==7) {
				count++;
			}
		}
		if (count!=0) {
			System.out.println("7 eleman olarak var");
		}else {
			System.out.println("7 eleman olarak yok");
		}
		
		
		//2.yol binarySearch() kullanarak
		//==>a)once kesim
		int nums[]= {12,5,6};
		 Arrays.sort(nums);
		  nums[0]=nums[2];
		  nums[1]=nums[2];
		  System.out.println(Arrays.toString(nums));
		
	}

}
