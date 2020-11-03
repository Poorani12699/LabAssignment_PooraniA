
/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to print date and time
 */
import java.util.*;
import java.time.*;
public class PrintDateandTime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year -  month - date : ");
		String day = sc.nextLine();
		String month = sc.nextLine();
		String year = sc.nextLine();
		int d = Integer.parseInt( year ); // enter year[ie. 1996]
		int m = Integer.parseInt( month );  // 1-12 for January-December.
		int y = Integer.parseInt( day );  //1-28/31 
		LocalDate date = LocalDate.of( y , m , d );
	    LocalDate now = LocalDate.now();
	    Period diff = Period.between(date, now);
	    System.out.println("Difference is " + diff.getYears()+" " +"years"+ " "+diff.getMonths()+" "+"months"+" "+ diff.getDays()+" "+"days");
	}
}