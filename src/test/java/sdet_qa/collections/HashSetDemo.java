package sdet_qa.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo
{

	public static void main(String[] args)
	{
		Set<Object> myset = new HashSet<Object>(); // hetrogenios data
		// HashSet<Object> myset = new HashSet<Object>(); //hetrogenios data
		// HashSet<String> myset = new HashSet<String>(); // homogenios data

		myset.add("abc");
		myset.add("abc");
		myset.add(123);
		myset.add(12.44);
		myset.add('c');
		myset.add(null);
		myset.add(null);

		System.out.println(myset);

		Iterator<Object> it = myset.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
