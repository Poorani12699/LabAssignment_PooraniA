/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to print the elements in alphabetical order
 */
import java.util.*;
public class AlhpabeticalOrder 
{
	public static void main(String[] args)
	{
        int number;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings : ");
        number = sc.nextInt();//number of string   
        String strings[] = new String[number];
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < number ; i++)
        {
        	strings[i] = sc.nextLine();//string input
        }
        sc.close();
        for (int i = 0; i < number; i++) 
        {
            for (int j = i + 1; j < number; j++) { 
                if (strings[i] != strings[j]) //swap function
                {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        System.out.println("Strings in Sorted Order:");
        for (int i = 0; i <= number - 1; i++) 
        {
            System.out.println(strings[i] + ", ");//to display sorted array
        }
    }
}