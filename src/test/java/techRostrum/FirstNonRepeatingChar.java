package techRostrum;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar
{

	public static void main(String[] args)
	{
		String str = "swiss";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char c : str.toCharArray())
		{
			if (map.get(c) == 1)
			{
				System.out.println("First non-repeating character: " + c);
				break;
			}
		}
	}

}
