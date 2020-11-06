/*
 * Author : Poorani A
 * Date : 4/11/2020
 * Description : Program to use hash map to sort 
 */
package com.cg.labnine;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MyMain
{
	public static void main(String[] args)
	{
		ExerciseOne exerciseOne = new ExerciseOne();
		ExerciseTwo exerciseTwo = new ExerciseTwo();
		ExerciseThree exerciseThree = new ExerciseThree();
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 10);//hard coded input
		map.put(2, 10);
		map.put(3, 10);
		map.put(4, 10);
		map.put(5, 10);
		map.put(6, 10);
		System.out.println(exerciseOne.sortMapToList(map));//calling Exercise one and displaying the out put
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(exerciseTwo.countCharacter(str.toCharArray()));//calling Exercise two and displaying the out put
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(exerciseThree.getSquares(array));//calling Exercise three and displaying the out put
		sc.close();
	}
}