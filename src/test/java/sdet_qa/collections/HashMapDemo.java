package sdet_qa.collections;

import java.util.HashMap;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		// Map<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "vaibhav");
		hm.put(2, "cde");
		hm.put(3, "efg");
		hm.put(4, "hij");
		hm.put(1, "klm");

		System.out.println(hm);

	}

}
