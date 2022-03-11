package com.objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class CompareObjects implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(123, "Vijay");
		Employee emp1 = new Employee(123, "Vijay");
		
		
		System.out.println(emp.equals(emp1));
		
		if (emp == emp1)
			System.out.println("Hello");
		
		if (emp.toString() == emp.toString())
			System.out.println("world");
		
		System.out.println(emp.toString().equals(emp1.toString()));
		
		System.out.println(emp.hashCode() == emp1.hashCode());
		
		Map<String, String> employee = new HashMap<String, String>();  
		employee.put("1", "Vijay");
		employee.put("2", "Kani");
		
		ConcurrentHashMap<String, String> mike   
	        = new ConcurrentHashMap<String, String>();   
		mike.put("1", "Vijay"); //Adding values  
		mike.put("4", "Kani"); 
		mike.put("3", "hen");   
		mike.put("2", "jug"); 
		
		mike.keySet().forEach(e -> System.out.println(e));
		
		Iterator iter = mike.keySet().iterator();
		
		while(iter.hasNext()){
			String next = (String) iter.next();
			System.out.println(mike.get(next));
			
			//mike.put("5", "Hello");
		}
		
		/*Iterator iter1 = employee.keySet().iterator();
		
		while(iter1.hasNext()){
			String next = (String) iter1.next();
			System.out.println(employee.get(next));
			
			employee.put("3", "Hello");
		}*/
		   
		
	}

	static class Employer{
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	
}
