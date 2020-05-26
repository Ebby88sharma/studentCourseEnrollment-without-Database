package studentCourseManagementApp;

import java.util.Scanner;

public class Student {
	private String fname;
	private String lname;
	private int gradeYear;
	private String StudentID;
	private String courses="";
	private int tuitionBalance;
	private static int costOfCourse=600;
	private static int id=1000;
	
	// constructor : Prompt user to enter student's name and year
	public Student() {
		System.out.println("Enter First name");
		Scanner in=new Scanner(System.in);
				this.fname=in.nextLine();
				System.out.println("Enter last name");
				this.lname=in.nextLine();
				System.out.println("1: First year\n2: Second year\n3: Third year\n4: Final year\nEnter Student level ");
					this.gradeYear=in.nextInt();
					setStudentId();
					//System.out.println(fname+"  "+lname+"  "+gradeYear+" "+StudentID);
					
	}
   
	
   // Generate an ID
   private void setStudentId() {
	   id++;
	   //Grade leve+ ID
	   this.StudentID= gradeYear+""+ id;
   }
	//Enroll in course
   public void enroll() {
	   //Get inside a loop , when user hits Q
	   do {
	   System.out.println("Enter course to enroll(Q to quit):");
	   Scanner in=new Scanner(System.in);
	   String course=in.nextLine();
	   if(!course.equals("Q")) {	
		   courses = courses + "\n" + course;
		   tuitionBalance = tuitionBalance + costOfCourse;
	   }
	   else {
		   
		   break;
	   }
	   }while(1!=0);
	   //System.out.println("Enrolled in :"+courses);
	   
   }
	//view balance
   public void viewBalance() {
	   System.out.println("Your balance is: $"+tuitionBalance);
   }
	//pay tuition 
   public void payTuition() {
	   viewBalance();
	   System.out.println("Enter your payment: $");
	   Scanner in = new Scanner(System.in);
	   int payment = in.nextInt();
	   tuitionBalance = tuitionBalance - payment;
	   System.out.println("Thankyou for your payment of $"+payment);
	   viewBalance();
   }
	//Show status
   public String toString() {
	   return "Name: " + fname + " " + lname +
			   "\nGrade Level:" + gradeYear +
			   "\nStudent ID:" + StudentID +
			   "\nCourses Enrolled:" + courses + 
			   "\nBalance: $" + tuitionBalance;
   }
}
