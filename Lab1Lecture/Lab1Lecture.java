// Kristina Shaw
// Lab 1 Lecture

package edu.monmouth.Lab1Lecture;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import edu.monmouth.Employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
    	try {
            // Redirect error output to a file
            System.setErr(new PrintStream(new FileOutputStream("lab1lecture.txt")));
        	// Declare a List that stores Employee objects in a LinkedList
        	List<Employee> employees = new LinkedList<>();

        	// Add employees to the list
        	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
        	employees.add(salaryEmployee1);

        	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
        	employees.add(salaryEmployee2);

        	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
        	pieceEmployee1.setPiecesMade(2000);
        	employees.add(pieceEmployee1);

        	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
        	pieceEmployee2.setPiecesMade(3500);
        	employees.add(pieceEmployee2);

        	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
        	employees.add(salaryEmployee3);

        	SalesEmployee salesEmployee = new SalesEmployee(60000);
        	salesEmployee.setCommission(30000);
        	employees.add(salesEmployee);


        	// Iterate forward through the list and print each Employee's attributes
        	System.out.println("Here is our given employee list: ");
        	Iterator<Employee> iterator = employees.iterator();
        	while (iterator.hasNext()) {
        		Employee employee = iterator.next();
        		System.out.println("Employee Type: " + employee.getClass().getSimpleName());
        		System.out.println("Monthly Pay: $" + employee.getMonthlyPay());
        		System.out.println(employee.toString());
        		System.out.println();
        	}

        	// Remove salaryEmployee1 from the list
        	iterator = employees.iterator();
        	while (iterator.hasNext()) {
        		Employee employee = iterator.next();
        		if (employee instanceof SalaryEmployee) {
        			SalaryEmployee salaryEmployee = (SalaryEmployee) employee;
        			if (salaryEmployee == salaryEmployee1) {
        				iterator.remove();
        				break;
        			}
        		}
        	}

        	// Iterate through the list and print each Employee's attributes after removal
        	System.out.println("Here is our newly revised list after removing salaryEmployee1");
        	iterator = employees.iterator();
        	while (iterator.hasNext()) {
        		Employee employee = iterator.next();
        		System.out.println("Employee Type: " + employee.getClass().getSimpleName());
        		System.out.println("Monthly Pay: $" + employee.getMonthlyPay());
        		System.out.println(employee.toString());
        		System.out.println();
        	}
        	// create and size an array
        	Employee[] employeeArray = new Employee[employees.size()];

        	// Transfer the List to the array
        	employees.toArray(employeeArray);

        	System.out.println("We have transferred our list of employees to an array. Here is our newly revised array of employees:");
        	for (Employee employee : employeeArray) {
        		System.out.println("Employee Type: " + employee.getClass().getSimpleName());
        		System.out.println("Monthly Pay: $" + employee.getMonthlyPay());
        		System.out.println(employee.toString());
        		System.out.println();
        	}
    	 } catch (IOException e) {
             e.printStackTrace();
        }
   }
}	
