package day31abstraction;

public abstract class Otel {
	
	/*
	 1)abstract clasi final yapamayizcunku final claslarin child  lari olaamaz 
	 habuki biz abstract claslari child classlari olsunn ve child class lari bazi seyleri yapmaya mecbur biraksin diye olustururuz
	 bu celiskiden diolayi java abstract claslarin final olmasina musade etmez Compile Time Error verir.
	 2) abstract metodlarde final olamazlar . cunku final olurlarsa override edilemezler,
	 halbuki biz abstract metodlari override yapmak icin olustururuz.
	 3)bstract metodlarde private olamazlar . cunku private olurlarsa override edilemezler,
	 halbuki biz abstract metodlari override yapmak icin olustururuz.
	 */
	
	public abstract void kahvalti();
	
	public void cay() {
		System.out.println("7/24 cay servisi");
		
	}
	public void wifi() {
		System.out.println("7/24 wifi servisi");
	}
}
