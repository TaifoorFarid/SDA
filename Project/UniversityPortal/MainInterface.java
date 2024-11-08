package UniversityPortal;

import javax.swing.*;

import QuizSetup.QuizSetupPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {
    private JButton takeAttendanceButton;
    private JButton setAssignmentButton;
    private JButton setQuizButton;
    private JButton uploadContentButton;

    public MainInterface() {
        setTitle("University Portal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        takeAttendanceButton = new JButton("Take Attendance");
        setAssignmentButton = new JButton("Set Assignment");
        setQuizButton = new JButton("Set Quiz");
        uploadContentButton = new JButton("Upload Course Content");

        takeAttendanceButton.setBounds(20, 20, 160, 30);
        setAssignmentButton.setBounds(200, 20, 160, 30);
        setQuizButton.setBounds(20, 70, 160, 30);
        uploadContentButton.setBounds(200, 70, 160, 30);

        add(takeAttendanceButton);
        add(setAssignmentButton);
        add(setQuizButton);
        add(uploadContentButton);

        setQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                QuizSetupPanel quizSetupPanel = new QuizSetupPanel();
                quizSetupPanel.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        MainInterface mainInterface = new MainInterface();
        mainInterface.setVisible(true);
    }
}
