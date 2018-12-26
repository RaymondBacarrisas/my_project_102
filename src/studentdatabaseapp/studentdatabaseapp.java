package studentdatabaseapp;

import java.util.Scanner;

public class studentdatabaseapp {

	public static void main(String[] args) {
		
		// Ask how many user we want to add
		System.out.print("Enter the number of student to be list; ");
		Scanner in  = new Scanner(System.in);
		int numberofstudent = in.nextInt();
		student[] stu = new student[numberofstudent];
		// Create a number of a new student
		for(int n = 0; n < numberofstudent; n++)
		{
			stu[n] = new student();
			stu[n].setImPrivateButAccesible(1);
			stu[n].enroll(); 
			stu[n].payTution();
			System.out.println(stu[n].toString());
		}

	}

}
