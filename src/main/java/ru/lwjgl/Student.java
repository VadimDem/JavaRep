package ru.lwjgl;

public class Student {

    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String toString() {
        return "Студент: " + "Имя = " + firstName + "; Фамилия = " + lastName + "; Возраст = " + age;
    }
}
