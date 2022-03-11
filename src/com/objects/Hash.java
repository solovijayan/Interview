package com.objects;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String > hshMap = new HashMap<>();
		
		hshMap.put(null, "one");
		hshMap.put(null, "one");
		hshMap.put("null", "one");
		hshMap.put(null, "two");
		hshMap.put(null, null);
		hshMap.put("one", "two");
		
		System.out.println(hshMap);
		
		hshMap.entrySet().stream().forEach(e -> System.out.println(e.getValue()));
		
		List<String> list = hshMap.entrySet().stream().filter(e -> e.getKey() == "one").map(Map.Entry::getValue).sorted().collect(Collectors.toList());
		list = hshMap.entrySet().stream().filter(e -> e.getKey() == "one").map(Map.Entry::getValue).collect(Collectors.toList());
		
		System.out.println(list);
		
		Hashtable<String, String> hshTable = new Hashtable<>();
		
		
		
		

	}

}
