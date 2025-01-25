package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionUtil<T>
{
	public Collection<T> chooseCollectionType()
	{
		Collection<T> collection = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 to Select ArrayList");
		System.out.println("Press 2 to Select LinkedList");
		System.out.println("Press 3 to Select Vector");
		System.out.println("Press 4 to Select Priority Queue");
		System.out.println("Press 5 to Select Array Deque");
		System.out.println("Press 6 to Select Treeset");
		System.out.println("Press 7 to Select Hashset");
		System.out.println("Press 8 to Select LinkedHashset");
		System.out.println("...Enter your choice...");
		switch(s.nextInt())
		{
		case 1 : System.out.println("..ArrayList..");
				 collection = new ArrayList<T>();
		break;
		case 2 : System.out.println("..LinkedList..");
				 collection = new LinkedList<T>();
		break;
		case 3 : System.out.println("..Vector..");
				 collection = new Vector<T>();
		break;
		case 4 : System.out.println("..Priority Queue..");
				 collection = new PriorityQueue<T>();
		break;
		case 5 : System.out.println("..Array Deque..");
				 collection = new ArrayDeque<T>();
		break;
		case 6 : System.out.println("..TreeSet..");
				 collection = new TreeSet<T>();
		break;
		case 7 : System.out.println("..HashSet..");
				 collection = new HashSet<T>();
		break;
		case 8 : System.out.println("..Linked HashSet..");
				 collection = new LinkedHashSet<T>();
		break;
		default : System.out.println("..Invalid Choice..");
		break;
		}
		return collection;
	}
}
