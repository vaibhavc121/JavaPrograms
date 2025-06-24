package techRostrum;

import java.util.HashMap;
import java.util.Map;

public class WordFreqInSentence
{

	public static void main(String[] args)
	{
		String str = "the cat and the dog";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] ch = str.split(" ");
		for (int i = 0; i < ch.length; i++)
		{

			String str1 = ch[i];

			map.put(str1, map.getOrDefault(str1, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
