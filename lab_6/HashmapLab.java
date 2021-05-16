package lab_6;

import java.util.*;
public class HashmapLab {
	public static void main(String[] args) {
		
		HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
		hm.put(1, 'A');
		hm.put(5, 'C');
		hm.put(4, 'E');
		hm.put(2, 'D');
		hm.put(3, 'B');
		List<Character> ch = new LinkedList<Character>();
		ch = getValue(hm);
		for(char c : ch)
			System.out.println(c);
		
	}
	
	public static List<Character> getValue(HashMap<Integer,Character> hm)
	{
		List<Character> ch = new LinkedList<Character>(hm.values());   //use hm.keySet() for sorting w.r.t keys
		Collections.sort(ch);
		
		return ch;
	}
	
	

}
