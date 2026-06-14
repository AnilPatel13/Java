package CoreJava.Project.Quiz;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[1] = new Question(2, "What is the capital of Germany?", "Paris", "London", "Berlin", "Madrid", "Berlin");
        questions[2] = new Question(3, "What is the capital of Italy?", "Rome", "London", "Berlin", "Madrid", "Rome");
        questions[3] = new Question(4, "What is the capital of Spain?", "Paris", "London", "Berlin", "Madrid", "Madrid");
        questions[4] = new Question(5, "What is the capital of Portugal?", "Lisbon", "London", "Berlin", "Madrid", "Lisbon");
    }

    public void playQuiz(){

        int i =0;
        for (Question q: questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1 : " + q.getOption1());
            System.out.println("Option 2 : " + q.getOption2());
            System.out.println("Option 3 : " + q.getOption3());
            System.out.println("Option 4 : " + q.getOption4());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your answer: ");
            selection[i] = scanner.nextLine();
            i++;
        }

        for(String s: selection)
            System.out.println(s);

    }

    public void printScore(){
        int score = 0;
        for(int i=0;i< questions.length;i++) {
            String selected = selection[i];
            String userAnswer = "";
            switch (selected) {
                case "1": userAnswer = questions[i].getOption1(); break;
                case "2": userAnswer = questions[i].getOption2(); break;
                case "3": userAnswer = questions[i].getOption3(); break;
                case "4": userAnswer = questions[i].getOption4(); break;
            }
            if(userAnswer.equals(questions[i].getAnswer()))
                score++;
        }
        System.out.println("Your score is: " + score);
    }
}
