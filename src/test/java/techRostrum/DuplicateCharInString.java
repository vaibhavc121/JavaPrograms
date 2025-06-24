package techRostrum;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString
{

	public static void main(String[] args)
	{
		String str = "programming";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

}
