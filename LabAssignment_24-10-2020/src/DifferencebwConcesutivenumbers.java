/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to print difference between concesutive numbers
 */
import java.util.*;
public class DifferencebwConcesutivenumbers
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);  
		 System.out.print("Enter the number of array elements : ");  
		 int length = sc.nextInt();  
		 int[] array = new int[length];  
		 System.out.println("Enter the array: ");  
		 for(int i = 0; i < length; i++)  
		 {  
				 array[i] = sc.nextInt();  
		 }  
		 sc.close();
		 difference(array, length);  
		 if(length % 2 != 0)
		 {
		  	System.out.println(array[length-1]);//to print last digit is odd set
		 }
	}
	public static void difference(int array[], int length)  
	{  
		int difference;  
		for(int i = 0; i < length - 1; i++)
		{  
			difference = Math.abs(array[i] - array[i + 1]);  //differnce between numbers
			System.out.print(difference+" ");  
		}  
	}  
}
  