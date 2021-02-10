package main;

public class QuizRunner {
    public static void main (String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What color is hippopotamus milk?\nA: Blue\nB: White\nC:Pink\nD:Yellow\n" +
                "Please enter a single letter as an answer.", "C");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Which is a coding language? Select all that apply.\nA: Boa\nB:JavaScript\nC:Python\nD:Java#,",
                "BC");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Can you code a quiz?", "TRUE");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
