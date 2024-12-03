/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Comparator;

public class StudentsModel {
    private ArrayList<Student> students;

    public StudentsModel(ArrayList<Student> students) {
        this.students = students;
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student findStudentWithHighestGPA() {
        if (students.isEmpty()) {
            return null;
        }

        Student highestGPAStudent = students.get(0); 

        for (Student student : students) {
            if (student.getGpa() > highestGPAStudent.getGpa()) {
                highestGPAStudent = student;
            }
        }

        return highestGPAStudent;
    }

    public Student findStudentWithLowestGPA() {
        if (students.isEmpty()) {
            return null;
        }

        Student lowestGPAStudent = students.get(0); 

        for (Student student : students) {
            if (student.getGpa() < lowestGPAStudent.getGpa()) {
                lowestGPAStudent = student;
            }
        }

        return lowestGPAStudent;
    }


    public double calculateAverageGPA() {
        if (students.isEmpty()) {
            return 0.0; 
        } else {
            int i = 1;
            double total = 0;
            for (Student st : students)
            {
                total += st.getAge();
                i++;
            }
            return total / i;
        }
    }

    public ArrayList<Student> getStudentsSortedByGPA() {
        ArrayList<Student> sortedList = new ArrayList<>(students);
        sortedList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        return sortedList;
    }

    public void appendStudents(ArrayList<Student> newStudents) {
        students.addAll(newStudents);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
            System.out.println("GPA: " + student.getGpa());
        }
    }
}
