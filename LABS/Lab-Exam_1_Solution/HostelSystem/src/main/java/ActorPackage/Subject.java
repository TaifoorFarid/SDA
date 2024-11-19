/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActorPackage;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Subject
{
    private ArrayList<Student> students = new ArrayList<>();
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    // Method to attach (add) a student to the list
    public void attachStudent(Student student) {
        if (student != null) {
            students.add(student);
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add a null student!");
        }
    }

    // Method to detach (remove) a student from the list
    public void detachStudent(Student student) {
        if (students.remove(student)) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found in the list!");
        }
    }
    
    
    public void notify(String message) {
        for (Student std : students) {
            std.update(message);
        }
    }
}
