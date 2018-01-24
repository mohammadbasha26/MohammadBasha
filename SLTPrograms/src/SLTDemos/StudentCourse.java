package SLTDemos;

public class StudentCourse {
	
	String studentId,studentName;
	Course course; 
	public StudentCourse(String studentId,String studentName,String courseId,String courseName,double price,int duration)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		course=new Course(courseId,courseName,price,duration);
	}	
	public void displayDetails()
	{
		System.out.println("Student ID:"+studentId);
		System.out.println("Student Name:"+studentName);
		course.displayCourse(); //calling the displayCourse() method of course class
	}	
}


