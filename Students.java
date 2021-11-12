package com.syntax.class15HW;

public class Students {
 /*Create a Class called Students
Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class 
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
  */
	
	String studentName;
	String studentId;
	static int numberOfStudent = 100;
	
	public static void main(String[] args) {
		
		Students S1 = new Students();
		S1.studentName = "Mary";
		S1.studentId = "12345";
		S1.numberOfStudent++;
		System.out.println("Student's name is "+ S1.studentName + ", student's ID is "+ S1.studentId+ " and student's number is "+ S1.numberOfStudent);
		
		Students S2 = new Students();		
		S2.studentName = "Kate";
		S2.studentId = "14789";
		S2.numberOfStudent++;
		System.out.println("Student's name is "+ S2.studentName + ", student's ID is "+ S2.studentId+ " and student's number is "+ S2.numberOfStudent);
		
		Students S3 = new Students();		
		S3.studentName = "Jacob";
		S3.studentId = "96325";
		S3.numberOfStudent++;
		System.out.println("Student's name is "+ S3.studentName + ", student's ID is "+ S3.studentId+ " and student's number is "+ S3.numberOfStudent);
	
	
	
	
	
	}
}
