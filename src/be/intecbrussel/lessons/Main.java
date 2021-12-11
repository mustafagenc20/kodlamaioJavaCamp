package be.intecbrussel.lessons;

public class Main {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson(1,"SQL", "Mustafa", 20);

        Lesson lesson2 = new Lesson();
        lesson2.id = 2;
        lesson2.name = "React";
        lesson2.instructor = "Mustafa Genc";
        lesson2.sum = 25;

        Lesson lesson3 = new Lesson();
        lesson3.id = 3;
        lesson3.name = "Java";
        lesson3.instructor = "Mustafa Genc";
        lesson3.sum = 45;

        Lesson lesson4 = new Lesson();
        lesson4.id = 4;
        lesson4.name = "Angular";
        lesson4.instructor = "Mustafa Genc";
        lesson4.sum = 35;

        Lesson[] lessons = {lesson1, lesson2, lesson3, lesson4};
        for(Lesson lesson : lessons){
            System.out.println(lesson.id);
            System.out.println(lesson.name);
            System.out.println(lesson.instructor);
            System.out.println(lesson.sum);
        }
        LessonManager lessonManager = new LessonManager();
        lessonManager.deleteLesson(lesson4);
        lessonManager.addLesson(lesson4);
        lessonManager.deleteLesson(lesson3);
        lessonManager.addLesson(lesson3);
        lessonManager.deleteLesson(lesson2);
        lessonManager.addLesson(lesson2);


    }
}
