package oop�ntro;

public class Course {

	public Course() {
		System.out.println("Kurs Se�imi : ");
	}
	
	public Course(int id ,String courseName ,double lessonHour ,String intstructorName ) {
	
		this.courseId = id;
		this.courseName = courseName;
		this.lessonHour= lessonHour;
		this.�nstructorName = �nstructorName;
		
		
		
	}
		
	
	int courseId ;
	String courseName ;
	double lessonHour ;
	String �nstructorName;
	
	
}
