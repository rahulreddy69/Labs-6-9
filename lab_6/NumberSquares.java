package lab_6;

import java.util.HashMap;
import java.util.Map;

public class NumberSquares {
	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,7};
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp = getSquares(arr);
		for(int i : mp.keySet())
		{
			System.out.println("The square of "+i+" is "+mp.get(i));
		}
		
		
	}
	public static Map<Integer,Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i : arr)
		{
			if(!mp.containsKey(i))
			{
				mp.put(i, i*i);
			}
			
		}
		return mp;
	}
}
