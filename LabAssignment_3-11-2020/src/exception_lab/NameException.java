/**
 * Author : Poorani A
 * Date : 3/11/2020
 * Description : Program to check valid name
 *
 */
package exception_lab;
import java.util.*;
public class NameException 
{
	public static void main(String[] args) 
	{
		String firstName,lastName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		firstName=sc.nextLine();
		System.out.println("Enter the second name");
		lastName=sc.nextLine();
		nameNotValidException(firstName, lastName);
	}
	private static void nameNotValidException(String firstName, String lastName)
	{
		int lengthOfFirstName=firstName.length();
		int lengthOfLastName=lastName.length();
		try 
		{
			if(lengthOfFirstName==0 && lengthOfLastName==0 )
			{
				throw new Exception("Exception occurs due to name");
			}
			else
			{
				System.out.println("First name is: "+firstName+" Last name is: "+lastName);
			}
		}
		catch(Exception ex)
		{
			System.out.println("The first name and last name are null");
		}
	}
}