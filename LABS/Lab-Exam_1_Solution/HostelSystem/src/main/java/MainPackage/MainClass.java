package MainPackage;

import ActorPackage.Student;
import ActorPackage.Subject;
import EligibilityFilter.EligibilityFilter;
import PaymentFilter.PaymentFilter;
import ServicesAvalingFilter.ServicesAvalingFilter;
import java.io.*;

public class MainClass {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Read student data from file and attach to subject
        try (BufferedReader br = new BufferedReader(new FileReader("C://AA--TAIFOOR FARID SIDDIQUI//5th Semester//SDA//MidLab//HostelSystem//Data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) continue;

                // Parse student data
                String[] data = line.split(",");
                String id = data[0].trim();
                String name = data[1].trim();
                double distanceFromHostel = Double.parseDouble(data[2].trim());
                String number = data[3].trim();

                Student student = new Student(id, name, distanceFromHostel, number);

                // Attach student to Subject
                subject.attachStudent(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data file: " + e.getMessage());
            return;
        }

        // Call filters and service allocation
        EligibilityFilter eligibilityFilter = new EligibilityFilter();
        eligibilityFilter.filterStudentsByDistance(subject);

        PaymentFilter paymentFilter = new PaymentFilter();
        paymentFilter.filterStudentsByFee(subject);

        ServicesAvalingFilter servicesFilter = new ServicesAvalingFilter();
        servicesFilter.assignRoomAndSeat(subject);

        // Print remaining students after processing
        System.out.println("Final list of students:");
        for (Student student : subject.getStudents()) {
            System.out.println(student.getStdName());
        }
    }
}
