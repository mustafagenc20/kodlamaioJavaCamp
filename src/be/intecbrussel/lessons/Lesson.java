package be.intecbrussel.lessons;

public class Lesson {
    int id;
    String name;
    String instructor;
    int sum;

    public Lesson() {
        System.out.println("... ...");
    }

    public Lesson(int id, String name, String instructor, int sum) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.sum = sum;
    }
}
