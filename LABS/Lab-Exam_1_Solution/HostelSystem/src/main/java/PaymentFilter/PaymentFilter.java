/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaymentFilter;

import ActorPackage.Student;
import ActorPackage.Subject;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class PaymentFilter
{
    public void filterStudentsByFee(Subject subject) {
        ArrayList<Student> students = subject.getStudents(); // Get all students from Subject

        // Create a temporary list to store students to be removed
        ArrayList<Student> studentsToRemove = new ArrayList<>();

        // Check feeSubmitted for each student
        for (Student student : students) {
            if (!student.isFeeSubmitted()) { // If feeSubmitted is false
                studentsToRemove.add(student); // Mark for removal
            }
        }

        // Remove the students marked for removal
        for (Student student : studentsToRemove) {
            subject.detachStudent(student); // Detach student using Subject's method
        }
        
        subject.notify("Thank You for clearing fee we will inform you with your seat number");
    }
}
