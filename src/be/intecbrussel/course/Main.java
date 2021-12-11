package be.intecbrussel.course;

public class Main {

    public static void main(String[] args) {

        Course course = new Course(123,"SQL", "DB");
        Course course1 = new Course(1234,"SQL1", "DB1");
        Instructor instructor = new Instructor(321, "Mustafa", "Java");
        Instructor instructor1 = new Instructor(3211, "Mustafa1", "Java1");

        CourseInstructorManager courseInstructorManager = new CourseInstructorManager();
        courseInstructorManager.courseManager(course);
        courseInstructorManager.instructorManager(instructor);
        courseInstructorManager.courseManager(course1);
        courseInstructorManager.instructorManager(instructor1);
    }
}
