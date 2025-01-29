# Employee Management System

This project is a simple Java-based Employee Management System. It demonstrates the use of Java collections, custom comparators, and sorting mechanisms to manage and organize employee data. The system allows users to create multiple employee objects and sort them based on different criteria such as `ID`, `Name`, `Age`, and `Salary`.

## Employee Sorting Application

### Overview
This project is a simple **Employee Sorting Application** written in Java. It demonstrates how to work with various Java collections (ArrayList, LinkedList, Vector) and sort objects based on different attributes. The application allows users to choose the type of collection for storing employee records and to sort the list of employees based on different criteria, including ID, Name, Age, and Salary.

### Features
- **Custom Employee Class**: Contains attributes such as ID, Name, Age, and Salary.
- **Multiple Sorting Options**: Users can sort the list of employees by their ID, Name, Age, or Salary.
- **Choice of Collection Type**: Users can choose to store employee data in either ArrayList, LinkedList, or Vector.
- **Flexible Sorting Mechanism**: The sorting is done using custom `Comparator` classes that define how employees should be compared based on the chosen criteria.

### How It Works
1. **Employee Object**: An employee object is created with the following attributes: 
   - `ID`
   - `Name`
   - `Age`
   - `Salary`
2. **Collection Type**: Users can select one of the following collection types to store employee records:
   - **ArrayList**
   - **LinkedList**
   - **Vector**
3. **Sorting Options**: The user can choose to sort the employees by:
   - **ID**: Sorts employees by their unique ID.
   - **Name**: Sorts employees alphabetically by their name.
   - **Age**: Sorts employees based on their age in ascending order.
   - **Salary**: Sorts employees based on their salary in ascending order.

## Prerequisites
- Java Development Kit (JDK) installed (version 8 or above).
- Basic understanding of Java programming.

## Code Structure

### Classes

1. **Employee**
   - Represents an employee object with the fields `id`, `name`, `age`, and `salary`.
   - Includes getters, setters, and a `toString()` method for displaying employee details.

2. **CompareBasedOnId**
   - Implements `Comparator<Employee>` to sort employee objects by `ID`.
   - The `compare()` method compares employee `id` attributes to determine the sorting order.

3. **CompareBasedOnName**
   - Implements `Comparator<Employee>` to sort employee objects by `Name`.
   - The `compare()` method compares employee `name` attributes alphabetically using `compareTo()`.

4. **CompareBasedOnAge**
   - Implements `Comparator<Employee>` to sort employee objects by `Age`.
   - The `compare()` method compares employee `age` attributes to determine the sorting order.

5. **CompareBasedOnSalary**
   - Implements `Comparator<Employee>` to sort employee objects by `Salary`.
   - The `compare()` method compares employee `salary` attributes to determine the sorting order.

6. **ListUtil**
   - A utility class to help the user choose between different types of collections such as `ArrayList`, `LinkedList`, or `Vector` to store employee objects.
   - This class allows flexibility in selecting the collection type at runtime.

7. **EmployeeMainClass**
   - The entry point of the application.
   - It provides the functionality to allow users to add employee objects to a list and select a sorting criterion (`ID`, `Name`, `Age`, or `Salary`) for sorting the employee list.
   - The `Collections.sort()` method is used to apply the corresponding comparator for sorting.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Ananthadatta02/Employee_Data-Handler.git
