package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Veli");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhane");
		System.out.println(linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);
		
		linkedList.add(1, "Cemal");
		System.out.println(linkedList);
		
		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);
		
		linkedList.addLast("Ayse");
		System.out.println(linkedList);
		
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);
		linkedList.addAll(4, linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println(linkedList);
		
		linkedList.remove(1);
		System.out.println(linkedList);
		
		linkedList.remove("Canan");
		System.out.println(linkedList);
		
		linkedList.removeAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence(linkedList2);
		System.out.println(linkedList);
		
		
		
		
		
	}

}
