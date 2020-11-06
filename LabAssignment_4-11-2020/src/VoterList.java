/*
 * Author : Poorani A
 * Date : 4/11/2020
 * Description : Program to print voter list 
 */
import java.util.*;
public class VoterList 
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> voterList = new HashMap<Integer,Integer>();//insert all map attributes
		voterList.put(1, 100);
		voterList.put(2, 10);
		voterList.put(3, 40);
		voterList.put(4, 70);
		List<Integer>voterDetail = votersList(voterList);
		System.out.println(voterDetail);
	}
	private static List<Integer> votersList(Map<Integer, Integer> voterList)//check age
	{
		List<Integer> voterDetail = new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet())
		{
			if(entry.getValue()>18)//condition check to display whetrhe the voter is eiegible or not
			{
				voterDetail.add(entry.getKey());
			}
		}
		return voterDetail;
	}
}