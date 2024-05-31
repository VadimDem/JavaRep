package ru.lwjgl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student1 = new Student("Даниил","Шаширин",22);
        Student student2 = new Student("Даниил","Александров",20);
        Student student3 = new Student("Владислав","Цой",19);
        Student student4 = new Student("Вадим","Горшков",19);
        Student student5 = new Student("Вадим","Демин",20);
        Student student6 = new Student("Михаил","Матюшев",19);
        Student student7 = new Student("Максим","Деванов",20);
        Student student8 = new Student("Галя","Подъякова",20);
        Student student9 = new Student("Степан","Ременец",19);
        Student student10 = new Student("Анастасия","Балабкина",19);

        Group group1 = new Group(330);
        Group group2 = new Group(410);
        Group group3 = new Group(132);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);

        group1.printStudents();
    }

}