/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to sum of cubes of all the numbers in a digit
 */
import java.util.*;
public class SumofCube
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");//user input
		int number = sc.nextInt();
		sc.close();
		int result = cubeSum(number);//function call
		System.out.println("sum of the cube of digits :" +result);
	}
	public static int cubeSum(int num) 
	{
		int sum = 0, digit;
		while(num != 0) 
		{
			digit = num%10;
			sum = sum +(digit*digit*digit);//cube of number
			num = num / 10;
		}
		return sum;//return statement
	}
}
