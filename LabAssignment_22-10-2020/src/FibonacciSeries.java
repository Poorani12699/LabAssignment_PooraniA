/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to fibonacci series
 */
import java.util.*;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");//user input for number of terms
		int number= sc.nextInt();	
		sc.close();
		for(int i = 0; i < number;i++)
		{
			System.out.println(fibonacci(i) +  " ");
		}
	}
	private static int fibonacci(int n) 
	{
		if(n <= 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);//fibonacci number
	}
}