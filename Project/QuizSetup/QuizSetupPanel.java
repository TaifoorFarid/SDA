package QuizSetup;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizSetupPanel extends JFrame {
    private JTextField questionCountField;
    private JButton submitButton;

    public QuizSetupPanel() {
        setTitle("Set Quiz");
        setSize(300, 200);
        setLayout(null);

        JLabel questionCountLabel = new JLabel("Enter number of questions:");
        questionCountLabel.setBounds(20, 30, 200, 30);
        add(questionCountLabel);

        questionCountField = new JTextField();
        questionCountField.setBounds(20, 70, 150, 30);
        add(questionCountField);

        submitButton = new JButton("Next");
        submitButton.setBounds(20, 110, 100, 30);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int questionCount = Integer.parseInt(questionCountField.getText());
                QuestionEntryPanel questionEntryPanel = new QuestionEntryPanel(questionCount);
                questionEntryPanel.setVisible(true);
                dispose();
            }
        });
    }
}
