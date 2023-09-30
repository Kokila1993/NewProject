package org.login;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo{
	
	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<Integer, String>();
		
		m.put(10, "Java");
		m.put(20,"Python");
		m.put(30, "JavaScript");
		m.put(40, "Ruby");
		m.put(10, "C#");
		m.put(60, "Java");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println("Map size is:"+size);
		
		String string = m.get(30);
		System.out.println(string);
		
		String remove = m.remove(40);
		System.out.println(remove);
		
		boolean containsKey = m.containsKey(20);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("C#");
		System.out.println(containsValue);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		System.out.println("");
		System.out.println("First ForEach loop ");
		
		for (Entry<Integer, String> x : entrySet) {
			
			System.out.println(x);
			
		}
		
		System.out.println("");
		
		System.out.println("Second ForEach loop ");
		
		for (Entry<Integer, String> entry : entrySet) {
			
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
			
		}
		m.clear();
		System.out.println(m);
		
	}
}		