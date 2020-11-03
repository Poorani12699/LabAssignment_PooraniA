/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to calculate the difference between sum of squares and square of sum
 */
import java.util.*;
public class CalculateDifference 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");//user input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = sumofSquare(number) - squareofSum(number);//function call
		System.out.println("The difference between sum of sqares of n number:" +result);
		sc.close();
	}
	public static int sumofSquare(int n) {
		int sum = 0;
		for(int i = 1; i <= n;i++) {
			sum += (i*i);//square sum
		}
		return sum;
	}
	public static int squareofSum(int n) {
		int square = 0, sum = 0;
		for(int i = 1; i <= n;i++) {
			sum += i;//sum of terms
		}
		return sum * sum;
	}
}

