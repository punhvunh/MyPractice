package by.epam.learn.legacycollections.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMain {

	public static void main(String[] args) {
		Hashtable<String,Integer> hashtable = new Hashtable<>();
		hashtable.put("Jeans", 5);
		hashtable.put("T-shirt", 25);
		hashtable.put("Gloves", 1);
		hashtable.compute("Shoes", (k,v) -> 77);
		hashtable.compute("Shoes", (k,v) -> v + k.length());
		hashtable.computeIfAbsent("Pans", v -> 11);
		System.out.println(hashtable);
		Enumeration<String> keys = hashtable.keys();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
		Enumeration<Integer> values = hashtable.elements();
	}
}
