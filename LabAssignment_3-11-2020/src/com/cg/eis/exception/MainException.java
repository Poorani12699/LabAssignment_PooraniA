/**
 * Author : Poorani A
 * Date : 3/11/2020
 * Description : Program to check salary exception
 *
 */
package com.cg.eis.exception;
import java.util.Scanner;
public class MainException
{
	public static void main(String[] args)
	{
		EmployeeException employee=new EmployeeException();//object creation
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary:");
		employee.setSalary(sc.nextFloat());
		salaryException(employee.getSalary());
	}
	private static void salaryException(float salary) 
	{
		try 
		{
			if(salary < 3000)//check for exception
				throw new Exception();
			else
				System.out.println("The salary of the employee is "+salary);
		}
		catch(Exception e)
		{
			System.out.println("Salary cannot be less than 3000");
		}
	}
}