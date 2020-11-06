/*
 * Author : Poorani A
 * Date : 4/11/2020
 * Description : Program to sort an array
 */
import java.util.Arrays;
import java.util.*;
public class ArraySort 
{
	public static void main(String[] args) 
	{
		{
			Integer[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };//hardcoded input
			System.out.println("Original Array:");
			for (int i = 0; i < intArray.length; i++)
				System.out.print(intArray[i] + "  ");//printing the input array
			System.out.println();
			String strArray[] = new String[intArray.length];
			for (int i = 0; i < intArray.length; i++)
				strArray[i] = String.valueOf(intArray[i]);
			System.out.println(Arrays.toString(strArray));//printing the sorted array
		}
	}

}