package QuizManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuizManager {
    public static void saveQuiz(ArrayList<Question> questions) {
        try (FileWriter writer = new FileWriter("quiz.txt")) {
            for (Question question : questions) {
                writer.write(question.toString() + "\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
