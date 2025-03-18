package colecciones;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<> ();
		System.out.println("Arraylist vacío");
		System.out.printf("================%n");
		System.out.println(al);
		
		al.add("one");
		al.add("two");
		
		System.out.printf("%nArrayList ahora lleno%n");
		System.out.printf("=======================%n");
		System.out.println(al);
		
		System.out.printf("%nArrayList añadiendo un elemento%n");
		System.out.printf("===============================%n");
		al.add(1, "caracola");
		System.out.println(al);
		
		
	}
}
