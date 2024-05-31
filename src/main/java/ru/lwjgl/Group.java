package ru.lwjgl;

public class Group {
    private int numberGroup;
    private Student[] students = new Student[20];
    private int studentCount = 0;

    public Group(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void addStudent(Student student) {
        if (studentCount < 20) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Груупа Заполнена");
        }
    }
    public void printStudents(){
        System.out.println("Студенты в группе " + numberGroup + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].toString());
        }
    }
}
