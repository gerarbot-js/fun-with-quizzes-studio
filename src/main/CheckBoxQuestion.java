package main;

public class CheckBoxQuestion extends Question {

    // Class variables

    // Constructors
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A,B,C"
        // answer = "a,b,c"

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
