package techRostrum;

import java.util.Arrays;

public class StringArray
{

	public static void main(String[] args)
	{
		char[] arr = { 'a', 'b', 'c', 'd' };
		// System.out.println(arr[0]);

		System.out.println(Arrays.toString(arr));

//		int a=10, b=10;
//		System.out.println(a+b);

//		HashMap<K, V> hm=new HashMap<K, V>();
//		hm.put

//		HashMap hm = new HashMap();
//		hm.put(1, "vaibhav");
//		System.out.println(hm.get(1));

//		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		hm.put(1, 121);
//		hm.put(2, 122);
//
//		System.out.println(hm.entrySet());
//		System.out.println(hm.get);

//		String str = "vaibhav";
//		char[] arr = str.toCharArray();
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		int[] arr =
//		{ 5, 2, 3, 4 };
//
//		int smallest = arr[0];
//
//		for (int i = 1; i < arr.length; i++)
//		{
//			if (smallest < arr[i])
//			{
//				smallest = arr[i];
//			}
//		}
//		System.out.println(smallest);

//		String[] arr =
//		{ "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			// System.out.print(arr[i].replaceAll("day", "") + " ");
//			System.out.print(arr[i].substring(0, 3) + " ");
//		}

//		for (int i = 1; i <= 5; i++)
//		{
//			for (int j = 1; j <= (2 * i - 1); j++)
//			{
//
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 10; i = i + 2)
//		{
//			System.out.println(i);
//		}

//		int num = 5;
//		int fact = 1;
//
//		for (int i = 1; i <= num; i++)
//		{
//			fact = fact * i;
//		}
//		System.out.println(fact);

//		for (int i = 2; i <= 10; i = i + 2)
//		{
//			System.out.println(i);
//		}
//		int f1 = 0;
//		int f2 = 1;
//		int f3;
//
//		System.out.print(f1 + " " + f2 + " ");
//		for (int i = 1; i <= 10; i++)
//		{
//			f3 = f1 + f2;
//			System.out.print(f3 + " ");
//			f1 = f2;
//			f2 = f3;
//		}

//		int num = 1234;
//
//		// int result = 1234 % 10;
//		int rev = 0;
//		while (num > 0)
//		{
//			int rem = num % 10;
//			rev = (rev * 10) + rem;
//			num = num / 10;
//
//		}
//
//		System.out.println(rev);
//		int[] arr =
//		{ 1, 2, 3, 4, 5 };
//		for (int i = arr.length - 1; i >= 0; i--)
//		{
//			System.out.print(arr[i] + " ");
//		}

//		int start = 0;
//		int end = arr.length - 1;
//
//		while (start < end)
//		{
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//		}
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}

//		String str = "I am vaibhav and vaibhav and";
//
//		String[] arr = str.split(" ");
//
//		for (int i = 0; i < arr.length - 1; i++)
//		{
//			for (int j = i + 1; j < arr.length; j++)
//			{
//				if (arr[i].equals(arr[j]))
//				{
//
//				}
//				else
//				{
//					System.out.println(arr[i]);
//				}
//			}
//		}

//		Map<String, Integer> hm = new HashMap<String, Integer>();
//		hm.put("vaibhav", 1);
//		System.out.println(hm);
//		System.out.println(hm.get("vaibhav"));
		// System.out.println(hm.);

//		int[] arr =
//		{ 1, 2, 3, 4, 5 };
//
//		for (int x : arr)
//		{
//			System.out.print(x + ",");
//		}
//		int[] arr =
//		{ 4, 1, 3, 2, 5 };
//
//		for (int i = 0; i < arr.length - 1; i++)
//		{
//			for (int j = i + 1; j < arr.length; j++)
//			{
//				if (arr[i] > arr[j])
//				{
//					// Swap arr[i] and arr[j]
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}

//		int[] arr =
//		{ 4, 1, 3, 2, 5 };
//
//		int temp = arr[0];
//
//		for (int i = 1; i < arr.length; i++)
//		{
//			if (temp < arr[i])
//			{
//				temp = arr[i];
//			}
//		}

		// System.out.println("smallet no is: " + temp);

//		String str = "how are you";
//		String arr[] = str.split(" ");
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			String nstr = arr[i];
//			char nch[] = nstr.toCharArray();
//
//			int left = 0;
//			int right = nch.length - 1;
//
//			while (left < right)
//			{
//				char temp = nch[left];
//				nch[left] = nch[right];
//				nch[right] = temp;
//
//				left++;
//				right--;
//			}
//			System.out.print(new String(nch) + " ");
//
//		}

//		String str = "I am vaibhav";
//		String arr[] = str.split(" ");
//
//		int left = 0;
//		int right = arr.length - 1;
//
//		while (left < right)
//		{
//			String temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//
//			left++;
//			right--;
//		}
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}

//		String arr[] =
//		{ "abc", "cde", "efg" };
//		System.out.println(arr);

//		String str = "nayan";
//		String orgstr = str;
//
//		int left = 0;
//		int right = str.length() - 1;
//		char ch[] = str.toCharArray();
//
//		while (left < right)
//		{
//			char temp = ch[left];
//			ch[left] = ch[right];
//			ch[right] = temp;
//			left++;
//			right--;
//		}
//
//		String newstr = new String(ch);
//
//		if (orgstr.equals(newstr))
//		{
//			System.out.println("palin");
//		}
//		else
//		{
//			System.out.println("not palin");
//		}

//		String str = "vaibhavchavan";
//		char arr[] = str.toCharArray();
//
//		for (int i = 0; i <= (arr.length - 7); i++)
//		{
//			System.out.print(arr[i]);
//		}

//		String str1 = "";
//		str1 = str1 + str.charAt(1);
//		System.out.println(str1);

//		for (int i = 0; i < str.length(); i++)
//		{
//			for (int j = str.length() - 1; j >= 0; j--)
//			{
//				while (str.charAt(i) != str.charAt(j))
//				{
//					str.charAt(i);
//
//				}
//			}
//		}

//		String str1 = "stop";
//		String str2 = "tops";
//
//		char ch1[] = str1.toCharArray();
//		char ch2[] = str2.toCharArray();
//
//		System.out.println(ch1[3]);

//		char temp[] =
//		{ 3 };
//
//		for (int i = 0; i < str1.length(); i++)
//		{
//			for (int j = 0; j < str2.length(); j++)
//			{
//				if (ch1[i] == ch2[j])
//				{
//					for(int k=)
//					temp[i] = ch1[i];
//				}
//			}
//		}
//
//		if (temp.equals(ch1))
//		{
//			System.out.println(temp);
//		}

//		String str = "laptap";
//		char arr[] = str.toCharArray();
//		int counter = 0;
//		char ch = 0;
//		String str1 = "a";
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			for (int j = 0; j < arr.length; j++)
//			{
//				if (arr[i] == arr[j])
//				{
//					counter++;
//					if (counter < 1)
//					{
//
//						System.out.println("duplicate characters are: " + arr[i] + ",");
//						ch = arr[i];
//
//					}
//
//				}
//			}
//			counter = 0;
//		}
//
//		System.out.print("duplicate character is: " + ch);

		// char ch[] =
//		{ 'a', 'b', 'c' };
//		int i = 0;
//		while (i < ch.length)
//		{
//			System.out.print(ch[i]);
//			i++;
//		}

//		String arr[] =
//		{ "abc def" };
//		System.out.println(arr.length);

//		String str = "aba def";
//		int original = str.length();
//		int result = str.replaceAll("a", "").length();
//		System.out.println(original - result);

//		String str = "laptop";
//		for (int i = 0; i <= str.length(); i++)
//		{
//			try
//			{
//				System.out.print(str.charAt(i) + " ");
//			}
//			catch (Exception e)
//			{
//				System.out.println("exception");
//			}
//
//		}
	}

}
