/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicesAvalingFilter;

import ActorPackage.Student;
import ActorPackage.Subject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Dell
 */
public class ServicesAvalingFilter
{
    private final Random random = new Random();
    private final HashSet<String> assignedSeats = new HashSet<>(); // To track assigned seats

    public void assignRoomAndSeat(Subject subject) {
        ArrayList<Student> students = subject.getStudents(); // Get all students from Subject

        for (Student student : students) {
            String assignedSeat;

            // Keep generating unique seat assignment until it's not already assigned
            do {
                int roomNumber = random.nextInt(50) + 1; // Rooms: 1 to 50
                int seatNumber = random.nextInt(2) + 1;  // Seats: 1 or 2
                assignedSeat = roomNumber + "-" + seatNumber; // Format: "Room-Seat"
            } while (assignedSeats.contains(assignedSeat));

            assignedSeats.add(assignedSeat); // Mark this seat as assigned

            // Notify the student
            String message = "You have been assigned Room " + assignedSeat.split("-")[0] + 
                             " and Seat " + assignedSeat.split("-")[1] + ".";
            student.update(message); // Call update method to inform the student
        }
    }
}
