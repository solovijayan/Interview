package com.objects;

public class Clone {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "Vijay");
		
		Employee emp2 = (Employee)emp1.clone();
		
		System.out.println(emp2);
	}

}
