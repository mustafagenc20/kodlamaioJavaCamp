package be.intecbrussel.lessons;

public class LessonManager {
    public void addLesson(Lesson lesson){
        System.out.println(lesson.name + " lesson % " + lesson.sum + " joined.");
        System.out.println(lesson.name + " lesson " + lesson.instructor + " joined.");
    }

    public void deleteLesson(Lesson lesson){
        System.out.println(lesson.name + " lesson added.");
    }
}
