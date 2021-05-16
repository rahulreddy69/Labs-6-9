package lab_6;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSort {
	
	public static void main(String[] args) {
		int arr[] = {34,56,47,85,32};
		ArrayList<Integer> al = getSorted(arr);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
	
	public static ArrayList<Integer> getSorted(int[] arr)
	{
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i : arr)
		{
			al.add(String.valueOf(i));
		}
		System.out.println("asd");
		for(int i=0; i<al.size();i++)
		{
			StringBuffer sb = new StringBuffer();
			
			sb.append(al.get(i));
			sb.reverse();
			String str = sb.toString();
			num.add(Integer.parseInt(str));
		}
		System.out.println("nnn");
		Collections.sort(num);
		return num;
	}
}
