package EligibilityFilter;

import ActorPackage.Student;
import ActorPackage.Subject;
import java.util.ArrayList;

public class EligibilityFilter {
    
    public void filterStudentsByDistance(Subject subject) {
        
        ArrayList<Student> students = subject.getStudents();
        
        ArrayList<Student> studentsToRemove = new ArrayList<>();

        // Check the distance of each student
        for (Student student : students) {
            if (student.getDistanceFromHostel() < 10) {
                studentsToRemove.add(student); // Mark for removal
            }
        }

        for (Student student : studentsToRemove) {
            subject.detachStudent(student); // Detach student using Subject's method
        }
        
        subject.notify("Eligible for hostle, Clear youe hostel dues.");
    }
}



