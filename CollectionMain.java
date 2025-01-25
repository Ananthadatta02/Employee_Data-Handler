package collection;

import java.util.Collection;
import java.util.Scanner;

class CollectionClass<T>
{
	
}

public class CollectionMain 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose which type of data to Store...");
			System.out.println("Click 1 to int type");
			System.out.println("Click 2 to double type");
			System.out.println("Click 3 to char type");
			System.out.println("Click 4 to String type");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1 : {
					 CollectionUtil<Integer> util = new CollectionUtil<Integer>();
					 Collection<Integer> c = util.chooseCollectionType();
					 while(true)
					 {
						 System.out.println("Press 1 to Add the Elements");
						 System.out.println("Press 2 to Remove the Elements");
						 System.out.println("Press 3 to Display the Elements");
						 System.out.println("Press 4 to Size/Count of the Elements");
						 System.out.println("Press 5 to Check Empty Or Not");
						 System.out.println("Press 6 to Conatins the Element or Not");
						 System.out.println("Press 7 to Clear the Elements");
						 System.out.println("Press 8 to Convert the Elements to Array");
						 int option = s.nextInt();
						 switch(option)
						 {
						 case 1 : System.out.println("Enter How many Elements to Add..");
						 		  int count = s.nextInt();
						 		  System.out.println("Enter the Elements :-");
						 		  for (int i = 0; i <= count-1; i++) 
						 		  {
						 			  int ele = s.nextInt();
						 			  c.add(ele);
						 		  }
						 		  System.out.println("...Elements added Successfully...\n");
						 break;
						 case 2 : {
							 	  System.out.println("Enter the Element to Remove.." );
						  		  int ele = s.nextInt();
						  		  for (Integer inte : c) 
						  		  {
						  			  if(ele == inte)
						  			  {
						  				  c.iterator().remove();
						  			  }
								  }
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Removed Successfully...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 }
						 break;
						 case 3 : if(c.iterator().hasNext())
						 		  {
							 	  	  System.out.println("...Displaying the Elements...");
							 	  	  System.out.println(c);
							 	  	  System.out.println("\n");
						 		  }
						 		  else
						 			  System.out.println("...No Elements Present...\n");
						 break;
						 case 4 : System.out.print("Number of Elements Present is :- ");
						 		  System.out.println(c.size());
						 		  System.out.println("\n");
						 break;
						 case 5 : if(c.iterator().hasNext())
							 		  System.out.println("...Not Empty...It Contains the Elemets\n");
						          else
						        	  System.out.println("...Empty...\n");
						 break;
						 case 6 : System.out.println("Enter the Element to Check.. Which is Present Or Not..");
						  		  int ele = s.nextInt();
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Present...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 break;
						 case 7 : c.clear();
						 		  System.out.println("...All Elemets are Cleared...\n");
						 break;
						 case 8 : System.out.println("Converting the Elements to Array...\n");
						 		  c.toArray();
						 		  System.out.println("Converted to Array Successfully..\n");
						 break;
						 default : System.out.println("..Invalid Choice..\n");
						 break;
						 }
						 System.out.println("Do you want to Continue.. y/n");
							char ch = s.next().charAt(0);
							if(ch == 'n' || ch =='N')
								break;
					 }
			}
			break;
			case 2 : {
					 CollectionUtil<Double> util = new CollectionUtil<Double>();
					 Collection<Double> c = util.chooseCollectionType();
					 while(true)
					 {
						 System.out.println("Press 1 to Add the Elements");
						 System.out.println("Press 2 to Remove the Elements");
						 System.out.println("Press 3 to Display the Elements");
						 System.out.println("Press 4 to Size/Count of the Elements");
						 System.out.println("Press 5 to Check Empty Or Not");
						 System.out.println("Press 6 to Conatins the Element or Not");
						 System.out.println("Press 7 to Clear the Elements");
						 System.out.println("Press 8 to Convert the Elements to Array");
						 int option = s.nextInt();
						 switch(option)
						 {
						 case 1 : System.out.println("Enter How many Elements to Add..");
						 		  int count = s.nextInt();
						 		  System.out.println("Enter the Elements :-");
						 		  for (int i = 0; i <= count-1; i++) 
						 		  {
						 			  double ele = s.nextInt();
						 			  c.add(ele);
						 		  }
						 		  System.out.println("...Elements added Successfully...\n");
						 break;
						 case 2 : {
							 	  System.out.println("Enter the Element to Remove.." );
						  		  int ele = s.nextInt();
						  		  for (Double doub : c) 
						  		  {
						  			  if(ele == doub)
						  			  {
						  				  c.iterator().remove();
						  			  }
								  }
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Removed Successfully...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 }
						 break;
						 case 3 : if(c.iterator().hasNext())
						 		  {
							 	  	  System.out.println("...Displaying the Elements...");
							 	  	  System.out.println(c);
							 	  	  System.out.println("\n");
						 		  }
						 		  else
						 			  System.out.println("...No Elements Present...\n");
						 break;
						 case 4 : System.out.print("Number of Elements Present is :- ");
						 		  System.out.println(c.size());
						 		  System.out.println("\n");
						 break;
						 case 5 : if(c.iterator().hasNext())
							 		  System.out.println("...Not Empty...It Contains the Elemets\n");
						          else
						        	  System.out.println("...Empty...\n");
						 break;
						 case 6 : System.out.println("Enter the Element to Check.. Which is Present Or Not..");
						  		  int ele = s.nextInt();
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Present...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 break;
						 case 7 : c.clear();
						 		  System.out.println("...All Elemets are Cleared...\n");
						 break;
						 case 8 : System.out.println("Converting the Elements to Array...\n");
						 		  c.toArray();
						 		  System.out.println("Converted to Array Successfully..\n");
						 break;
						 default : System.out.println("..Invalid Choice..\n");
						 break;
						 }
						 System.out.println("Do you want to Continue.. y/n");
							char ch = s.next().charAt(0);
							if(ch == 'n' || ch =='N')
								break;
					 }
					 }	
			break;
			case 3 : {
					 CollectionUtil<Character> util = new CollectionUtil<Character>();
					 Collection<Character> c = util.chooseCollectionType();
					 while(true)
					 {
						 System.out.println("Press 1 to Add the Elements");
						 System.out.println("Press 2 to Remove the Elements");
						 System.out.println("Press 3 to Display the Elements");
						 System.out.println("Press 4 to Size/Count of the Elements");
						 System.out.println("Press 5 to Check Empty Or Not");
						 System.out.println("Press 6 to Conatins the Element or Not");
						 System.out.println("Press 7 to Clear the Elements");
						 System.out.println("Press 8 to Convert the Elements to Array");
						 int option = s.nextInt();
						 switch(option)
						 {
						 case 1 : System.out.println("Enter How many Elements to Add..");
						 		  int count = s.nextInt();
						 		  System.out.println("Enter the Elements :-");
						 		  for (int i = 0; i <= count-1; i++) 
						 		  {
						 			  char ele = s.next().charAt(i);
						 			  c.add(ele);
						 		  }
						 		  System.out.println("...Elements added Successfully...\n");
						 break;
						 case 2 : {
							 	  System.out.println("Enter the Element to Remove.." );
						  		  int ele = s.nextInt();
						  		  for (Character ch : c) 
						  		  {
						  			  if(ele == ch)
						  			  {
						  				  c.iterator().remove();
						  			  }
								  }
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Removed Successfully...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 }
						 break;
						 case 3 : if(c.iterator().hasNext())
						 		  {
							 	  	  System.out.println("...Displaying the Elements...");
							 	  	  System.out.println(c);
							 	  	  System.out.println("\n");
						 		  }
						 		  else
						 			  System.out.println("...No Elements Present...\n");
						 break;
						 case 4 : System.out.print("Number of Elements Present is :- ");
						 		  System.out.println(c.size());
						 		  System.out.println("\n");
						 break;
						 case 5 : if(c.iterator().hasNext())
							 		  System.out.println("...Not Empty...It Contains the Elemets\n");
						          else
						        	  System.out.println("...Empty...\n");
						 break;
						 case 6 : System.out.println("Enter the Element to Check.. Which is Present Or Not..");
						  		  int ele = s.nextInt();
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Present...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 break;
						 case 7 : c.clear();
						 		  System.out.println("...All Elemets are Cleared...\n");
						 break;
						 case 8 : System.out.println("Converting the Elements to Array...\n");
						 		  c.toArray();
						 		  System.out.println("Converted to Array Successfully..\n");
						 break;
						 default : System.out.println("..Invalid Choice..\n");
						 break;
						 }
						 System.out.println("Do you want to Continue.. y/n");
							char ch = s.next().charAt(0);
							if(ch == 'n' || ch =='N')
								break;
					 }
					 }
			break;
			case 4 : {
					 CollectionUtil<String> util = new CollectionUtil<String>();
					 Collection<String> c = util.chooseCollectionType();
					 while(true)
					 {
						 System.out.println("Press 1 to Add the Elements");
						 System.out.println("Press 2 to Remove the Elements");
						 System.out.println("Press 3 to Display the Elements");
						 System.out.println("Press 4 to Size/Count of the Elements");
						 System.out.println("Press 5 to Check Empty Or Not");
						 System.out.println("Press 6 to Conatins the Element or Not");
						 System.out.println("Press 7 to Clear the Elements");
						 System.out.println("Press 8 to Convert the Elements to Array");
						 int option = s.nextInt();
						 switch(option)
						 {
						 case 1 : System.out.println("Enter How many Elements to Add..");
						 		  int count = s.nextInt();
						 		  System.out.println("Enter the Elements :-");
						 		  for (int i = 0; i <= count-1; i++) 
						 		  {
						 			  String ele = s.next();
						 			  c.add(ele);
						 		  }
						 		  System.out.println("...Elements added Successfully...\n");
						 break;
						 case 2 : {
							 	  System.out.println("Enter the Element to Remove.." );
						  		  int ele = s.nextInt();
						  		  for (String str : c) 
						  		  {
						  			  if(c.equals(ele))
						  			  {
						  				  c.iterator().remove();
						  			  }
								  }
						  		  if(c.contains(ele))
						  			  System.out.println("...Element is Removed Successfully...\n");
						  		  else
						  			  System.out.println("...Element is not Present...\n");
						 }
						 break;
						 case 3 : if(c.iterator().hasNext())
						 		  {
							 	  	  System.out.println("...Displaying the Elements...");
							 	  	  System.out.println(c);
							 	  	  System.out.println("\n");
						 		  }
						 		  else
						 			  System.out.println("...No Elements Present...\n");
						 break;
						 case 4 : System.out.print("Number of Elements Present is :- ");
						 		  System.out.println(c.size());
						 		  System.out.println("\n");
						 break;
						 case 5 : if(c.iterator().hasNext())
							 		  System.out.println("...Not Empty...It Contains the Elemets\n");
						          else
						        	  System.out.println("...Empty...\n");
						 break;
						 case 6 : System.out.println("Enter the Element to Check.. Which is Present Or Not..");
						  		  int ele = s.nextInt();
						  		  if(c.contains(ele))
						  			  System.out.println("Element " + ele + "is Present...\n");
						  		  else
						  			  System.out.println("Element " + ele + "is Not Present...\n");
						 break;
						 case 7 : c.clear();
						 		  System.out.println("...All Elemets are Cleared...\n");
						 break;
						 case 8 : System.out.println("Converting the Elements to Array...\n");
						 		  c.toArray();
						 		  System.out.println("Converted to Array Successfully..\n");
						 break;
						 default : System.out.println("..Invalid Choice..\n");
						 break;
						 }
						 System.out.println("Do you want to Continue.. y/n");
							char ch = s.next().charAt(0);
							if(ch == 'n' || ch =='N')
								break;
					 }
					 }
			break;
			default : System.out.println("Invalid Choice..");
			break;
			}
			
			System.out.println("...Do you want to Continue the Program... Y/N\n");
			char ch = s.next().charAt(0);
			if(ch == 'n' || ch =='N')
				break;	
		}
	}
}
