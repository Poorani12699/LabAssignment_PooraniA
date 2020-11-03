/**
 * Author : Poorani A
 * Date : 3/11/2020
 * Description : Program to check valid age
 *
 */
package exception_lab;
import java.util.*;
public class AgeException
{
	public static void main(String[] args) 
	{
		int age;// taking input from user
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		ageNotValied(age);//calling a method to check the condition
	}
	private static void ageNotValied(int age) 
	{
		try 
		{
			if(age<15)
				throw new Exception("Age is not valid");
			else
				System.out.println("The age you have entered is :"+age);
		}
		catch(Exception ex)
		{
			System.out.println("You have entered an in valid age :"+age);
		}
	}
}