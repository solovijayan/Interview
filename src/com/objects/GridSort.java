package com.objects;

import java.util.Arrays;

public class GridSort {
	public static void main (String args[]){
		String str = "atyer";
		
		 char[] strArray = str.toCharArray();
		 
		 Arrays.sort(strArray);
		 
		 System.out.println(new String(strArray));
		 String sorted = "bdca".chars()
			      .sorted().toString();
			      /*.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			      .toString();*/
		 
		 System.out.println(sorted);
	}
}
