/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to sum of natural number
 */
import java.util.*;
public class SumofNaturalNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");//user input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		calculateSum(number);
	}	
	private static void calculateSum(int num) 
	{
		int sum=0;
		for(int i = 1; i <= num; i++) 
		{
			if(i % 3 == 0 || i % 5 == 0)//to check weather divisible by 3 and 5
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}