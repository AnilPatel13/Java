package CoreJava.Project.Quiz;

public class Main {
    public static void main(String[] args) {
     System.out.println("Welcome to Quiz");

     QuestionService questionService = new QuestionService();
     questionService.playQuiz();
     questionService.printScore();

    }
}
