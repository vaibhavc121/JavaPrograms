package techRostrum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test
{

	public static void main(String[] args)
	{

		String str = "vaibhav";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue() == 1)
			{
				System.out.println("1st non repeating char: " + entry.getKey());
				break;
			}
		}

//		int[] arr = { 1, 2, 2, 3, 4, 5, 5 };
//
//		for (int i = 0; i < arr.length - 1; i++)
//		{
//			for (int j = i + 1; j < arr.length; j++)
//			{
//				if (arr[i] == arr[j])
//				{
//					System.out.println("duplicate: " + arr[i]);
//				}
//			}
//		}

//		String str = "vaibhav";
//
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//
//		char[] ch = str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++)
//		{
//			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
//		}
//
//		for (Map.Entry<Character, Integer> entry : map.entrySet())
//		{
//			if (entry.getValue() > 1)
//			{
//				System.out.println("duplicate char is: " + entry.getKey() + ":" + entry.getValue());
//			}
//		}

//		String str = "i am learning learning java java java programming";
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//		String[] arr = str.split(" ");
//		for (int i = 0; i < arr.length; i++)
//		{
//			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//		}
//
//		for (Map.Entry<String, Integer> entry : map.entrySet())
//		{
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			if (i % 2 != 0)
//			{
//				arr[i] = arr[i] * arr[i]; // square odd-indexed elements
//			}
//		}
//
//		// Print result
//		System.out.print("[");
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]);
//			if (i < arr.length - 1)
//			{
//				System.out.print(", ");
//			}
//		}
//		System.out.println("]");
//
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//		int[] a = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			if (arr[i] % 2 == 0)
//			{
//				arr[i] = arr[i] * arr[i];
//			}
//
//		}
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}

//		int[] arr = { 1, 2, 1, 3, 4, 5, 3 };
//
//		for (int i = 0; i < arr.length - 1; i++)
//		{
//			for (int j = i + 1; j < arr.length; j++)
//			{
//				if (arr[i] == arr[j])
//				{
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}

//		String str = "vaibhav";
//		char[] ch = str.toCharArray();
//
//		int i = 0;
//		int j = ch.length - 1;
//
//		while (i < j)
//		{
//			char temp = ch[i];
//			ch[i] = ch[j];
//			ch[j] = temp;
//
//			i++;
//			j--;
//		}
//
//		System.out.println(ch);
	}

}
