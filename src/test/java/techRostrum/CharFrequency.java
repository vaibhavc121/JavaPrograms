package techRostrum;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency
{

	public static void main(String[] args)
	{
		String str = "hello";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);

			if (map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			} else
			{
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> ch : map.entrySet())
		{
			System.out.println(ch.getKey() + ":" + ch.getValue());
		}

	}

}
