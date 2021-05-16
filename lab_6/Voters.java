package lab_6;

import java.util.*;

public class Voters {
	
	public static void main(String[] args) {
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp.put(101, 18);
		mp.put(102, 38);
		mp.put(103, 19);
		mp.put(104, 17);
		mp.put(105, 25);
		List al = votersList(mp);
		
		for(int i=0; i<al.size();i++)
			System.out.println("Voter with ID "+al.get(i)+" is eligible for vote");
	}
	
	public static List votersList(Map<Integer,Integer> mp)
	{
		List al = new LinkedList();
		for(int i : mp.keySet())
		{
			if(mp.get(i)>18)
				al.add(i);
				
		}
		return al;
	}

}
