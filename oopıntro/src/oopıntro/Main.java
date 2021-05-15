package oop�ntro;

public class Main {

	public static void main(String[] args) {
	
		Course course1 = new Course(1,"C#",12,"Engin Demiro�");
		Course course2 = new Course(2,"java",16,"Engin Demiro�" );
		Course course3 = new Course(3,"Python",18,"Engin Demiro�");
				
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses ) {
			System.out.println(course.courseName);
		}
		
		System.out.println(courses.length);
		
		CourseManager courseManager= new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		courseManager.deleteCourse(course1);
	}
	
}
