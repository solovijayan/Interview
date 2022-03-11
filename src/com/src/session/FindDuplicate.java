package com.src.session;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String str = "Missippim";
		ConcurrentHashMap<Character, Integer> dupMap = new ConcurrentHashMap<>(); 
		
		for (int i =0;i < str.length(); i ++){
			if (dupMap.containsKey(str.charAt(i)))
				dupMap.put(str.charAt(i), (dupMap.get(str.charAt(i)) +1));
			else
				dupMap.put(str.charAt(i), 1);
		}
		
		System.out.println(dupMap);
		Iterator<Entry<Character, Integer>> iter = dupMap.entrySet().iterator();
		
		for (int i =0; i< 2; i++)
			System.out.println(iter.next());
		
	}

}
