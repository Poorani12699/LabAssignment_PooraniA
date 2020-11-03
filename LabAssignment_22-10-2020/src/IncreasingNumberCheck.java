/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to check increasing number
 */
import java.util.*;
public class IncreasingNumberCheck 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");//user input
		int number=sc.nextInt();
		sc.close();
		boolean check = increasingNumber(number);
		if(check == true)
			System.out.println("In increasing order");
		else
			System.out.println("Not in increasing order");
		}
	public static boolean increasingNumber(int n) 
	{
		int temp1, temp2, temp3,count = 0;
		while(n != 0)
		{
			temp1 = n % 10;//swaping function
			temp3 = n;
			temp3 /= 10;
			temp2 = temp3 % 10;
			if(temp1 >= temp2)
			{
				count ++;
			}
			else 
			{
				return false;
			}		
			n /= 10 ;
		}
		if(count > 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}