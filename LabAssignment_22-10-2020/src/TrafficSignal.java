/**
 * Author : Poorani A
 * Date : 22/10/2020
 * Description : Program to display traffic signal based on user choice
 */
import java.util.*;
public class TrafficSignal 
{
	public static void main(String[] args) 
	{
		System.out.println("Traffic light Simulation\n");
		System.out.println("1.Red\n2.Yellow\n3.Green\n Enter your choice :");//user input
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();
		switch(choice) //user choice for dispaly
		{
			case 1: System.out.println("Stop");
					break;
			case 2: System.out.println("Ready");
					break;
			case 3: System.out.println("Go");
					break;
			default: System.out.println("Enter valid choice");
		}
	}
}
