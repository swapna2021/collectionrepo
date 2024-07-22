package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArrayList {

	public static void main(String[] args) throws CloneNotSupportedException  {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee("Swapna",123,50000,"Hyderabad");
		Employee e7=new Employee("Swapna",123,70000,"Hyderabad");
		Employee e8=new Employee("Swapna",123,90000,"Hyderabad");
		Employee e2=new Employee("Amit",234,90000,"Hyderabad");
		Employee e3=new Employee("Pooja",12,70000,"Delhi");
		Employee e4=new Employee("Kriti",34,60000,"Hyderabad");
		Employee e5=new Employee("Mohan",23,30000,"Delhi");
		Employee e6=new Employee("Preeti",2341,90000,"Delhi");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		System.out.println("With tostring");
		System.out.println(empList);
		System.out.println("Enhanced for loop");
		for(Employee emp:empList)
			System.out.println(emp);
		System.out.println("Using iterator");
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Sort Operation");
		//Collections.sort(empList);
		
		empList.sort(new CityComparator()
				.thenComparing(new NameComparator())
				.thenComparing(new SalaryComparator()));
		
		
		for(Employee emp:empList)
			System.out.println(emp);
		
		
		Employee employee = new  Employee();
		Employee emp1=(Employee) employee.clone();
		System.out.println(emp1.hashCode()+ " "+employee.hashCode());
		
		

	}

}
