package SLTDemos;

public class Course {

	String courseId,courseName;
	double price;
	int duration;
		public Course(String cId,String courseName,double price,int duration)
	{
		courseId=cId;
		this.courseName=courseName;
		this.price=price;
		this.duration=duration;
	}	
	public void displayCourse()
	{
		System.out.println("Course ID:"+courseId);
		System.out.println("Course Name:"+courseName);
		System.out.println("Price:"+price);
		System.out.println("Duration:"+duration);
	}
}


