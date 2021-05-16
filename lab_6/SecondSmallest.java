package lab_6;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		
		int arr[] = {2,3,1,4,6,8,4,2,5};
		int result = getSecondSmallest(arr);
		System.out.println(result);
	}

	public static int getSecondSmallest(int[] arr)
	{
		List<Integer> al = new ArrayList<Integer>();
		for(int i : arr)
			al.add(i);
		Collections.sort(al);
		int i = (int) al.get(1);
		return i;
	}
	
}
