package ru.lwjgl;

public class Group {
    private int groupNum;
    Student[] students = new Student[20];
    int studentCount = 0;

    public Group(int number) {
        this.groupNum = number;
        this.students = new Student[20];
        this.studentCount = 0;
    }

    public void addStudent(){
        if (studentCount < 20){
            students[studentCount] = student;

        }
    }
}
