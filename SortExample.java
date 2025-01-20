package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(18);
		al.add(9);
		al.add(122);
		al.add(1);
		al.add(55);
		al.add(45);
		System.out.println("Before Sorting-->" + al);
		Collections.sort(al); //Pre-defined Class
//		al = SortClass.sort(al); //User-Defined Class
		System.out.println("After Sorting-->" + al);
	}
}

class SortClass
{
	public static ArrayList<Integer> sort(ArrayList<Integer> al)
	{
		for(int i=0;i<=al.size();i++)
		{
			for (int j = i+1; j < al.size(); j++) 
			{
				if(al.get(i) > al.get(j))
				{
					int temp = al.get(i);
					int jEle = al.get(j);
					al.set(i, jEle);
					al.set(j, temp);
				}	
			}
		}
		return al;
	}
}
