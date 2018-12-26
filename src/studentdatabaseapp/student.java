package studentdatabaseapp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costofCourse = 600;
	private static int Id = 1000;
	private int paymentChange = 0;
	private int imPrivateButAccesible;
	private int imOnlyPrivate;
	
	public int getImPrivateButAccesible() {
		return imPrivateButAccesible;
	}

	public void setImPrivateButAccesible(int imPrivate) {
		this.imPrivateButAccesible = imPrivate;
	}

	// Constructor: Prompt user to enter student name and year
	public student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student First Name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter student Last Name: ");
		this.lastName = in.nextLine();
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student class level: ");
		this.gradeYear = in.nextLine();
		
		setstudentId();
		
	}
	
	// generate an ID
	private void setstudentId()
	{
		Id++;
		this.studentID = gradeYear + "" + Id;
		
	}
	
	// Enroll courses
	public void enroll()
	{
		do
		{
			System.out.print("Enter ciurse to enroll (Q to Quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{ courses = courses + "\n" + course; tuitionBalance = tuitionBalance + costofCourse; }
			else { System.out.println("Break"); break; }
		} while(1 != 0);
		System.out.println("Total Tuition: " + tuitionBalance);
	}
	
	// view balance
	public void viewBalance()
	{
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	// pay tuition
	public void payTution()
	{
		System.out.println("Enter your Payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		if(payment > tuitionBalance)
		{
			this.paymentChange = payment - tuitionBalance;
			this.tuitionBalance = 0;
		}
		else
		{
			this.paymentChange = 0;
			this.tuitionBalance = tuitionBalance - payment;
		}
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}
	
	// show status
	public String toString()
	{
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear + 
				"\nStudent ID: " + studentID +
				"\nCourse Applied: " + courses +
				"\nTuition Balance: " + tuitionBalance +
				"\nPayment Change: " + paymentChange;
	}
	
}
