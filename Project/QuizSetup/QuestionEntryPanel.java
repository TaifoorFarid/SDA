package QuizSetup;

import javax.swing.*;

import QuizManagement.Question;
import QuizManagement.QuizManager;
import UniversityPortal.MainInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuestionEntryPanel extends JFrame {
    private JTextField questionField;
    private JTextField[] answerFields;
    private JRadioButton[] answerButtons;
    private ButtonGroup buttonGroup;
    private JButton nextButton;
    private ArrayList<Question> questions;
    private int questionCount;
    private int currentQuestionIndex;

    public QuestionEntryPanel(int questionCount) {
        this.questionCount = questionCount;
        this.currentQuestionIndex = 0;
        this.questions = new ArrayList<>();

        setTitle("Enter Question");
        setSize(400, 300);
        setLayout(null);

        questionField = new JTextField();
        questionField.setBounds(20, 20, 340, 30);
        add(new JLabel("Question:")).setBounds(20, 0, 100, 20);
        add(questionField);

        answerFields = new JTextField[4];
        answerButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();

        for (int i = 0; i < 4; i++) {
            answerFields[i] = new JTextField();
            answerButtons[i] = new JRadioButton();
            buttonGroup.add(answerButtons[i]);
            add(new JLabel("Answer " + (i + 1) + ":")).setBounds(20, 60 + i * 40, 100, 20);
            answerFields[i].setBounds(100, 60 + i * 40, 200, 30);
            answerButtons[i].setBounds(310, 60 + i * 40, 20, 30);
            add(answerFields[i]);
            add(answerButtons[i]);
        }

        nextButton = new JButton("Next");
        nextButton.setBounds(150, 220, 100, 30);
        add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveQuestion();
            }
        });
    }

    private void saveQuestion() {
        String questionText = questionField.getText();
        String[] answers = new String[4];
        int correctAnswerIndex = -1;

        for (int i = 0; i < 4; i++) {
            answers[i] = answerFields[i].getText();
            if (answerButtons[i].isSelected()) {
                correctAnswerIndex = i;
            }
        }

        questions.add(new Question(questionText, answers, correctAnswerIndex));

        currentQuestionIndex++;
        if (currentQuestionIndex < questionCount) {
            resetForm();
        } else {
            QuizManager.saveQuiz(questions);
            JOptionPane.showMessageDialog(this, "Quiz successfully set!");
            dispose();
            new MainInterface().setVisible(true);
        }
    }

    private void resetForm() {
        questionField.setText("");
        buttonGroup.clearSelection();
        for (JTextField answerField : answerFields) {
            answerField.setText("");
        }
    }
}
