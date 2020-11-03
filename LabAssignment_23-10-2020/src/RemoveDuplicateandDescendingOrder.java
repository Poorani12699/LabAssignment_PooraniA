/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to remove dupicate number an dprint array in descending order
 */
import java.util.*;
public class RemoveDuplicateandDescendingOrder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array elements : ");
		int length = sc.nextInt();
		int array[] = new int[length];		
		System.out.println("Enter the array elements : ");
		for(int i = 0;i < length;i++)
		{
			array[i] = sc.nextInt();
		}
		sc.close();
		length = removeDuplicate(array,length);
		descendingOrder(array,length);		
	}
	public static int removeDuplicate(int array[],int length)
	{
		if(length == 0 || length == 1)
		{
			return length;
		}
		int j = 0;
		for(int i = 0;i < length - 1;i++)
		{	
			if(array[i] != array[i + 1])
			{
				array[j++] = array[i];		//remove dulicate number	
			}
		}
		array[j++] = array[length - 1];
		return array[j];
	}
	public static void descendingOrder(int array[],int length)
	{			
		int temp = 0;
		for(int i = 0;i < length;i++)			
		{
			for(int j = i;j < length;length++)
			{
				if(array[i] < array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Array in descending order : ");
		for(int i = 0; i < length; i++)
		{
			System.out.println(array[i]+" ,");//print in decending order
		}	
	}
}