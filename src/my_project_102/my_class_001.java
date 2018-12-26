package my_project_102;

import java.util.Scanner;

public class my_class_001 {
	private String firstName;
	private String lastName;
	private String department;
	private String Email;
	private String password;
	private int defaultpasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "civi.com";
	private Scanner in;
	
	
	// Constructor to receive first name and last name 
	public my_class_001(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Calling a method asking for department // return the department
		this.department = setDepartment();
		
		// randomized password
		this.password = randomPassword(defaultpasswordLength);
		
		// create E-mail
		Email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
	}
	
	// ask for the department
	private String setDepartment()
	{
		System.out.println("Enter the Department\n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\nEnter the Department: ");
		in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) { return "Dev"; }
		else if(depChoice == 3) { return "Acct"; }
		else { return ""; }
	}
	
	// generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "qwertyuiopasdfghjklzxcvbnm12357890";
		char[] password = new char[length];
		for(int i = 0; i < length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
		
	// set the mailbox capacity
	public void setmailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}

	// set the alternate Email
	public void setalternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	// change the password
	public void changePassword(String Password)
	{
		this.password = Password;
	}
	
	public int getmailBoxCapacity() { return this.mailboxCapacity; }
	public String getalternateEmail() { return this.alternateEmail; }
	public String getPassword() { return this.password; }
	
	public String showInfo()
	{
		return "Display Name: " + firstName +  " " + lastName + 
				"\nDisplay Email: " + Email + 
				"\nMailbox Capacity: " + mailboxCapacity + " mb";
	}
}
