package be.intecbrussel.course;

public class CourseInstructorManager {
    public void courseManager(Course course){
        System.out.println("Kurs bilgisi getirildi: " + course.name);
    }
    public void instructorManager(Instructor instructor){
        System.out.println("Egitmen bilgisi getirildi: " + instructor.name);
    }
}
