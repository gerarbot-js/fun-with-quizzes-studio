package main;

public class TrueFalseQuestion extends Question {

    // Class variables

    // Constructors
    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "True"
        // answer = "false"

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
