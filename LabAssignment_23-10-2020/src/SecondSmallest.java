/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to print the second smallest number of array 
 */
import java.util.*;
public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		System.out.println("Enter array element : ");//user input
		for(int i = 0;i < length;i++)
		{
			array[i] = sc.nextInt();
		}
		sc.close();
		getSecondElement(array,length);//function call
		System.out.println("Second elemnet is : "+array[length - 2]);
	}
	private static int getSecondElement(int array[], int length)
	{
		int temp;
		for(int i = 0;i < length - 1;i++)
		{
			for(int j = 0;j < length - j - 1;j++)
			{
				if(array[j] < array[j + 1])//swap function
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array[length];
	}

}