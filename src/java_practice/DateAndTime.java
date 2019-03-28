/*
 * Java Date and Time
 */

package java_practice;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;


public class DateAndTime 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String day=in.next();
		String month=in.next();
		String year=in.next();
		
		System.out.println(getDay(day,month,year));
		
		in.close();

	}
	
	private static String getDay(String dd,String mm,String yy)
	{
		int day=Integer.parseInt(dd);
		int month=Integer.parseInt(mm);
		int year=Integer.parseInt(yy);
		
		LocalDate ldate=LocalDate.of(year,month,day);
		DayOfWeek dow=ldate.getDayOfWeek();
		
		return dow.toString();
	}

}
