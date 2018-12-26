package MyPackage123;

import java.util.*;

public class myFirstClass123 
{
	private String firstName;
	private String middleName;
	private String lastName;
	
	private myFirstClass123()
	{
		System.out.println("Raymond Bacarrisas");
		// Date
		System.out.println(String.format("%tc", new Date()));
		System.out.println(String.format("%tr", new Date()));
		System.out.println(String.format("%tA, %tB %tD", new Date(), new Date(), new Date()));
		// Calendar
		Calendar c = Calendar.getInstance();
		c.set(20010, 1, 19, 15, 23);
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		c.setTimeInMillis(day1);
		System.out.println("new hour: " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("add 35 days ~ " + c.getTime());
		c.roll(c.DATE, 35);
		System.out.println("roll 35 days ~ " + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("set to 1 ~ " + c.getTime());
	}
	
	public myFirstClass123(String fname, String mname, String lname)
	{
		firstName = fname;
		middleName = mname;
		lastName = lname;
		System.out.println("Name: " + firstName + " " + middleName + ", " + lastName);
	}
	
	public static myFirstClass123 getObject()
	{
		return new myFirstClass123();
	}
}
