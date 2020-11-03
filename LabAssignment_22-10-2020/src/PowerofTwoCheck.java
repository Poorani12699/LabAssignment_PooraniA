

/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to check weather a number is power of two
 */
import java.util.*;
public class PowerofTwoCheck 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number : ");//user input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		boolean check = powerCheck(number);//function call
		if(check == true)
			System.out.println("Is a power of two");//if power of two
		else
			System.out.println("Is not a power of two");
	}
		public static boolean powerCheck(int num)
	{
		if(num == 0)
			return false;
		while(num > 1)
		{
			if(num % 2 != 0)//even number check
			{
				return false;
			}
			num /= 2;
		}
		return true;
	}
}
