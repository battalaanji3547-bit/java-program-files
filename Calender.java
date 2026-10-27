import java.util.Calendar;
import java.util.Date;
public class Calender
{
	public static void main(String []args)
{
		Calendar calendar=Calendar.getInstance();
		calendar.set(2025,9,3);
		Date firstDate=calendar.getTime();
		calendar.set(2024,8,1);
		Date secondDate=calendar.getTime();
		
		System.out.println("is firstDate before secondDate?"+firstDate.before(secondDate));
		System.out.println("is firstDate after secondDate?"+firstDate.after(secondDate));
		}
		}

