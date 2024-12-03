package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

import java.util.ArrayList;

import model.Student;
import model.StudentsModel;

public class StudentsController {

    private StudentsModel studentsModel;

    public StudentsController(StudentsModel studentsModel) {
        this.studentsModel = studentsModel;
    }

    // Find student by ID
    public Student findStudentById(int id) {
        return studentsModel.findStudentById(id);
    }

    // Find student with highest GPA
    public Student findStudentWithHighestGPA() {
        return studentsModel.findStudentWithHighestGPA();
    }

    // Find student with lowest GPA
    public Student findStudentWithLowestGPA() {
        return studentsModel.findStudentWithLowestGPA();
    }

    // Calculate average GPA
    public double calculateAverageGPA() {
        return studentsModel.calculateAverageGPA();
    }

    // Get students sorted by GPA (descending)
    public ArrayList<Student> getStudentsSortedByGPA() {
        return studentsModel.getStudentsSortedByGPA();
    }

    // Add new students
    public void addNewStudents(ArrayList<Student> newStudents) {
        studentsModel.appendStudents(newStudents);
    }

    // Display all students (assuming Student has a proper toString() method)
    public void displayAllStudents() {
        studentsModel.displayAllStudents();
    }
}