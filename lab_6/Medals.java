package lab_6;
import java.util.HashMap;

public class Medals {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		HashMap<Integer,String> grade = new HashMap<Integer,String>();
		
		hm.put(101, 84);
		hm.put(102, 71);
		hm.put(103, 95);
		hm.put(104, 90);
		hm.put(105, 80);
		grade = getStudents(hm);
		for(int i : grade.keySet())
			System.out.println("Student with "+i+" registration number got "+grade.get(i)+" medal");
		
	}
	
public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm)
{
	HashMap<Integer,String> medal = new HashMap<Integer,String>();
	for(int i : hm.keySet())
	{
		if((hm.get(i)>=90)&&(hm.get(i)<=100))
			medal.put(i, "Gold");
		else if((hm.get(i)>=80)&&(hm.get(i)<90))
			medal.put(i, "Silver");
		else if((hm.get(i)>=70)&&(hm.get(i)<80))
			medal.put(i, "Bronze");
		else
			medal.put(i,"No Medal");
	}
	return medal;
}
}
