/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to print string tokenizer
 */
import java.util.StringTokenizer;
import java.util.Scanner;
public class StringToken
{
	public static void main(String[] args) 
	{
	    int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of integers");
	    String str = sc.nextLine();
		//StringTokenizer is a class which is used to break the sentence to words
		StringTokenizer stringTokenizer=new StringTokenizer(str,",");
		while(stringTokenizer.hasMoreTokens()) 
		{
			String string = stringTokenizer.nextToken();
			System.out.println(string);
			int number = Integer.parseInt(string); // parseInt() converts String to integer in order to calculate the sum 
			sum += number;				
		}
		System.out.println("Sum of Integers is : "+sum);
				
	}

}