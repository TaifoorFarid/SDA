/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Dell
 */
import controller.StudentsController;
import model.Student;

import java.util.ArrayList;

public class StudentsView {

    private StudentsController studentsController;

    public StudentsView(StudentsController studentsController) {
        this.studentsController = studentsController;
    }

    public void displayAllStudents() {
        ArrayList<Student> students = studentsController.getStudentsSortedByGPA();

        System.out.println("Students sorted by GPA:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("GPA: 1  " + student.getGpa());
            System.out.println("------------------------");
        }
    }

    public void displayStudentWithHighestGPA() {
        Student highestGPAStudent = studentsController.findStudentWithHighestGPA();

        if (highestGPAStudent != null) {
            System.out.println("Student with the highest GPA:");
            System.out.println("ID: " + highestGPAStudent.getId());
            System.out.println("Name: " + highestGPAStudent.getName());
            System.out.println("GPA: " + highestGPAStudent.getGpa());
        } else {
            System.out.println("No students found.");
        }
    }

    // ... other methods for displaying different information or performing actions
}