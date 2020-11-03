/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to reverse and sort array
 * */
import java.util.*;
public class ReverseandSort
{
	public static void main(String[] args) 
	{
		System.out.println("Enter he size of an array :");//user input
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		getSorted(array,size);
	}
	private static void getSorted(int[] array, int length) 
	{
		int[] array1 = new int[length];
		int j = length;
		for(int i = 0;i < length;i++)//array sorting
		{
			array1[j-1] = array1[i];
			j--;	
		}
		System.out.println("Reversed array elements :");
		for(int k = 0;k < length;k++) {
			System.out.println(array1[k]);
		}
		int temp = 0;
		for(int k = 0;k < length;k++) {
			for(int l = k;l < length;l++) 
			{
				if(array1[k] < array1[l]) 
				{
					temp = array1[k];//swap function
					array1[k] = array1[l];
					array1[l] = temp;
				}
			}
		}
		System.out.println("Reversed sorted array elements:");
		 for(int k = 0;k < length;k++) {
			 System.out.println(array1[k]);
		 }				
	}
}