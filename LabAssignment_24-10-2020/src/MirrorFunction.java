/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to print mirror image of function
 */
import java.util.Scanner;
public class MirrorFunction
{
	public static void main(String[] args)
	{
		String string = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		string = sc.nextLine();
		sc.close();
		System.out.println(" "+string+"|"+" "+getImage(string));
	}
	private static String getImage(String string) 
	{
	   StringBuffer reverseString = new StringBuffer(string);
	   String reverse=reverseString.reverse().toString();
	    return reverse;
	}
}
