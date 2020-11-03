/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to replace a constant
 */
import java.util.*;
public class ReplaceConstant
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String string= sc.nextLine();
	    System.out.println(replaceConsonants(string.toCharArray())); 
	}
	public static String replaceConsonants(char[] string)  
	{ 
		for (int i = 0; i < string.length; i++) 
		{ 
			if (string[i] != 'a' && string[i] != 'e' && string[i] != 'i' && string[i] != 'o' && string[i] != 'u')     
			{
				string[i] = (char) (string[i] + 1);
			}	
		} 
		return String.valueOf(string); 
	} 
}