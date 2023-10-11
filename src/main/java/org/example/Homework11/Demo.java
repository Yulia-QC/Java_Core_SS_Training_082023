package org.example.Homework11;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("Ann", new String[]{"file1.java", "file2.txt", "file3.java", "file6.txt", null});
        Student student2 = new Student("Bob", new String[]{"file4.java", "file5.py"});
        Student student3 = new Student("Charlie", new String[]{"", "file7.java"});

        student1.calculateScore();
        student2.calculateScore();
        student3.calculateScore();

        System.out.println(student1.getName() + "'s score: " + student1.getScore());
        System.out.println(student2.getName() + "'s score: " + student2.getScore());
        System.out.println(student3.getName() + "'s score: " + student3.getScore());

    }
}
