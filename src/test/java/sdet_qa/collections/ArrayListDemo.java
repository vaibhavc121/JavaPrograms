package sdet_qa.collections;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		// if array list contains only integers then we need to specify <Integer>
		// wrapper class
		// if collection contains hetrogenious data then it should be object
		ArrayList<Object> myList = new ArrayList<Object>();
		// List mylistList = new ArrayList();
//		ArrayList<String> ob = new ArrayList<String>();
//
//		ob.add("abc");
//		ob.add("cde");
//		ob.add("efg");

		myList.add("abc");
		myList.add("a");
		myList.add(123);
		myList.add(12.22);
		myList.add(123);
		myList.add(null);

		System.out.println(myList);
	}

}
