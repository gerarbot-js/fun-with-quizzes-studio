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

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("True or false? You can code a quiz.", "TRUE");
        myQuiz.addQuestion(myTrueFalseQuestion);

        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion("What country is Cusco a part of?", "Peru");
        myQuiz.addQuestion(myShortAnswerQuestion);

        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion("Please enter a pH value that would be considered acidic.",
                0, 6);
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why you want to code (because it's great, right?).","Because it's great");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();
    }
}
