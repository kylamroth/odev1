package oopıntro;

public class Course {

	public Course() {
		System.out.println("Kurs Seçimi : ");
	}
	
	public Course(int id ,String courseName ,double lessonHour ,String intstructorName ) {
	
		this.courseId = id;
		this.courseName = courseName;
		this.lessonHour= lessonHour;
		this.ınstructorName = ınstructorName;
		
		
		
	}
		
	
	int courseId ;
	String courseName ;
	double lessonHour ;
	String ınstructorName;
	
	
}
