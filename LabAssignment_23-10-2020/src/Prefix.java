/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to print tprefix based on gender and marital status
 */
import java.util.*;
public class Prefix 
{
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		String[] prefix = {"Mr","Ms","Mrs"};
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println("Enter the gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter the marital status : ");
		String maritalstatus = sc.nextLine();
		sc.close();
		if(gender .equalsIgnoreCase("female"))//gender check
		{
			if(maritalstatus .equalsIgnoreCase("yes") )//marital status check
			{
				System.out.println(prefix[2]+"."+name);
			}
			else
			{
				System.out.println(prefix[1]+"."+name);
			}
		}		
		else
		{
			System.out.println(prefix[0]+"."+name);
		}			
	}
}
