
/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to print prime number
 */
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		String primenum = "";
		for(int i = 1;i <= number;i++)
		{
			int count = 0;
			for(int j = i;j >= 1;j--)
			{
				if(i % j == 0)//check prime numebr
				{
					count++;
				}
			}
			if(count == 2)
			{
				primenum = primenum + i +" ";
			}
		}
		System.out.println(primenum);
	}
}
