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
		voterList.put(101, 38);
		voterList.put(102, 15);
		voterList.put(103, 27);
		voterList.put(104, 69);
		List<Integer>voterDetail = votersList(voterList);
		System.out.println(voterDetail);
	}
	private static List<Integer> votersList(Map<Integer, Integer> voterList)//check age
	{
		List<Integer> voterDetail = new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet())
		{
			if(entry.getValue()>18)
			{
				voterDetail.add(entry.getKey());
			}
		}
		return voterDetail;
	}
}