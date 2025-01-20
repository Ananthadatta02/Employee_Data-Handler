package collection;

import java.util.Arrays;

class SortingClass
{
	public static void sort(int a[])
	{
		int temp;
		for(int i=0;i<=a.length-2;i++)
		{
			if(a[i] > a[i+1])
			{
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}


public class SortingElements 
{
	public static void main(String[] args) 
	{
		int a [] = {2,1,9,8,6,10};
		SortingClass.sort(a);
	}
}
