/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Random;

import controller.StudentsController;
import model.Student;
import model.StudentsModel;
import view.StudentsView;

public class Main {
    public static void main(String[] args) {
        StudentsModel studentsModel = new StudentsModel(new ArrayList<>());
        StudentsController studentsController = new StudentsController(studentsModel);
        StudentsView studentsView = new StudentsView(studentsController);
        ArrayList std = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int id = random.nextInt(100);
            String name = "Student " + i;
            int age = random.nextInt(30) + 18; 
            String major = "Major " + (i % 5); 
            double gpa = random.nextDouble() * 4.0; 

            Student student = new Student(id, name, age, major, gpa);
            std.add(student);
        }
        
        studentsModel.appendStudents(std);
        studentsView.displayAllStudents();

        studentsView.displayStudentWithHighestGPA();
    }
}