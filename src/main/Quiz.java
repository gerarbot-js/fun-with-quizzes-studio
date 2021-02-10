package main;

// Requirements:
// Add questions to quiz
// Run the quiz
// Grade the quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    // Class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public Quiz() {

    }

    // Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        // Loop through each question
        for (Question question : questions) {
            // Ask the user the question
            System.out.println(question.getTheQuestion());
            // Get the user's answer
            String userAnswer = this.getUsersAnswer();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            // Increment numberOfQuestionCorrect if user answered correctly
            if (userGotQuestionCorrect) {
                numberOfQuestionsCorrect++;
            }
        }

        // Grade the quiz
        double percentageOfQuestionsCorrect = ((double) numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("You scored a " + percentageOfQuestionsCorrect + "%.");
    }

        private String getUsersAnswer() {
            String usersAnswer = scanner.nextLine();
            return usersAnswer;
        }
}
