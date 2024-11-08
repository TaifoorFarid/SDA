package QuizManagement;

public class Question {
    private String questionText;
    private String[] answers;
    private int correctAnswerIndex;

    public Question(String questionText, String[] answers, int correctAnswerIndex) {
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(questionText + "\n");
        for (int i = 0; i < answers.length; i++) {
            sb.append((i + 1) + ". " + answers[i] + (i == correctAnswerIndex ? " (Correct)\n" : "\n"));
        }
        return sb.toString();
    }
}
