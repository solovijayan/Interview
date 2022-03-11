package com.objects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String args[]){
		List<String> list = Arrays.asList("1", "3","2");
		
		list.forEach(e  -> System.out.println(e));
		
		Collections.sort(list);
		
		list.forEach(e  -> System.out.println(e));
	}
}
