package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

//Steps Being Implemented :- 
//create a class --Employee
//Employee Object Consist of id, name, age, salary
//Perform all the mandatory operations
//Create multiple employee objects, and store it in a List type Collection
//Sort the employee objects based on their id

class Employee
{
	private int id;
	private String name;
	private int age;
	private int salary;
	public Employee(int id, String name, int age, int salary) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}


class CompareBasedOnId implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		if(e1.getId() > e2.getId())
			return 1;
		else if(e1.getId() < e2.getId())
			return -1;
		else
			return 0;
	}
}

class CompareBasedOnName implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		return e1.getName().compareTo(e2.getName());
	}
}

class CompareBasedOnAge implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		if(e1.getAge() > e2.getAge())
			return 1;
		else if(e1.getAge() < e2.getAge())
			return -1;
		else
			return 0;
	}
}

class CompareBasedOnSalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{
		if(e1.getSalary() > e2.getSalary())
			return 1;
		else if(e1.getSalary() < e2.getSalary())
			return -1;
		else
			return 0;
	}
}

// Utility class to choose the collection type for storing employees
class ListUtil<T> 
{
    public List<T> chooseListType() 
    {
        List<T> list = null;
        Scanner s = new Scanner(System.in);
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Vector");
        System.out.println("Choose any One Option...");
        int choice = s.nextInt();
        if (choice == 1)
            list = new ArrayList<T>();
        else if (choice == 2)
            list = new LinkedList<T>();
        else if (choice == 3)
            list = new Vector<T>();
        return list;
    }
}

public class EmployeeMainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		List<Employee> list = new ListUtil<Employee>().chooseListType();
		list.add(new Employee(1093,"Raju",26,30000));
		list.add(new Employee(1033,"Raghu",28,25000));
		list.add(new Employee(1026,"Charan",29,35000));
		list.add(new Employee(1011,"Shyam",24,45000));
		list.add(new Employee(1012,"Ram",25,60000));
		
		System.out.println("Press 1 to Sort Based On ID");
		System.out.println("Press 2 to Sort Based On Name");
		System.out.println("Press 3 to Sort Based On Age");
		System.out.println("Press 4 to Sort Based On Salary");
		int option = s.nextInt();
		
		switch (option) {
        case 1:
            Collections.sort(list, new CompareBasedOnId());
            break;
        case 2:
            Collections.sort(list, new CompareBasedOnName());
            break;
        case 3:
            Collections.sort(list, new CompareBasedOnAge());
            break;
        case 4:
            Collections.sort(list, new CompareBasedOnSalary());
            break;
        default:
            System.out.println("Invalid option!");
            break;
    }

    System.out.println("\n----- Sorted Employee List -----\n");
    for (Employee e : list) {
        System.out.println(e);
    }

    s.close();
	}
}
