package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	
	public static void main(String[] args) {
//		
//		LinkedList<String> fruitList=new LinkedList<String>();
//		fruitList.add("Orange");
//		fruitList.add("Banana");
//		fruitList.add("Apple");
//		
//		System.out.println(fruitList);
//		
//		fruitList.addFirst("Mango");
//		fruitList.addLast("Watermelon");
//		System.out.println(fruitList);
//		fruitList.add("Orange");
//		fruitList.add("Banana");
//		fruitList.add("Apple");
//		System.out.println(fruitList);
////		fruitList.add(null);
////		fruitList.add(null);
//		System.out.println(fruitList);
//		
//		Iterator<String> itr=fruitList.listIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		Collections.sort(fruitList);
//		System.out.println(fruitList);
////		fruitList.add(8,"swapna");
////		System.out.println(fruitList);
//		
//		LinkedList<String> myFruits= (LinkedList<String>) fruitList.clone();
//		System.out.println(myFruits);
//		System.out.println(fruitList.hashCode());
//		System.out.println(myFruits.hashCode());
//		myFruits.add("Pineapple");
//		System.out.println(myFruits);
//		System.out.println(myFruits.hashCode());
//		
		
		
		LinkedList<Employee> empList=new LinkedList<Employee>();
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
		
		LinkedList<Employee> myEmps=(LinkedList<Employee>) empList.clone();
		System.out.println(empList.hashCode());
		System.out.println(myEmps.hashCode());
		Employee e9=new Employee("Preeti",2341,90000,"Delhi");
		myEmps.add(e9);
		System.out.println(myEmps);
		
	
		
	}

}
