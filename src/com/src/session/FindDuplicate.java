package com.src.session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String str = "phillipinesip";
		Map<Character, Integer> dupMap = new HashMap<>(); 
		
		for (int i =0;i < str.length(); i ++){
			if (dupMap.containsKey(str.charAt(i)))
				dupMap.put(str.charAt(i), (dupMap.get(str.charAt(i)) +1));
			else
				dupMap.put(str.charAt(i), 1);
		}
		
		System.out.println(dupMap);
	}

}
