/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    private double gpa;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(int id, String name, int age, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }
    
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return gpa;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nAge: " + age + "\nMajor: " + major;
    }
}
