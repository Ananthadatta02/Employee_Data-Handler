# Employee Management System

This project is a simple Java-based Employee Management System. It demonstrates the use of collections, custom comparators, and sorting mechanisms to manage and organize employee data. 

## Features
- Create and store multiple employee objects with attributes:
  - `ID`
  - `Name`
  - `Age`
  - `Salary`
- Sort employee objects based on the following criteria:
  - **ID**
  - **Name**
  - **Age**
  - **Salary**
- Display the sorted employee list.

## Prerequisites
- Java Development Kit (JDK) installed (version 8 or above).
- Basic understanding of Java programming.

## Code Structure
### Classes
1. **Employee**
   - Represents an employee object with fields `id`, `name`, `age`, and `salary`.
   - Includes getters, setters, and a `toString()` method for displaying employee details.

2. **CompareBasedOnId**
   - Implements `Comparator` to sort employees by `ID`.

3. **CompareBasedOnName**
   - Implements `Comparator` to sort employees by `Name`.

4. **CompareBasedOnAge**
   - Implements `Comparator` to sort employees by `Age`.

5. **CompareBasedOnSalary**
   - Implements `Comparator` to sort employees by `Salary`.

6. **EmployeeMainClass**
   - Entry point of the application.
   - Allows users to add employees to a list and sort them based on their preference.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EmployeeManagementSystem.git
