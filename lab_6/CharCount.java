package lab_6;
import java.util.*;

public class CharCount {
	
	public static void main(String[] args) {
		char alphabets[] = {'a','b','c','a','c','d','s','a','q','w','e','r','g','t','h','y','u','j','k','i','o','l','p','m','n','b','v','c','x','a','s','d','f','g','h'};
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		mp = countChars(alphabets);
		for(char key : mp.keySet())
		{
			System.out.println(key+"  -  "+mp.get(key));
		}

	}
	
	
	public static Map<Character,Integer> countChars(char[] alphabets)
	{
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(char ch : alphabets)
		{
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch,1);
			}
		}
		return mp;
	}
}


