import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What are Java loops?",
                "a",
                List.of(
                        "a. Control statements used to repeat a block of code",
                        "b. Methods used for recursion",
                        "c. Classes used for iteration",
                        "d. Keywords for exception handling")));

        questions.add(new Question(
                "What is enhanced for-loop?",
                "c",
                List.of(
                        "a. A loop used only for arrays",
                        "b. A loop that runs infinitely",
                        "c. A simplified loop to iterate over collections/arrays",
                        "d. A loop used for multi-threading")));

        questions.add(new Question(
                "How do you handle multiple user inputs?",
                "b",
                List.of(
                        "a. Using System.out",
                        "b. Using Scanner class",
                        "c. Using Thread class",
                        "d. Using Iterator")));

        questions.add(new Question(
                "How is switch-case different from if-else?",
                "d",
                List.of(
                        "a. switch works with loops only",
                        "b. if-else works with integers only",
                        "c. switch cannot handle multiple cases",
                        "d. switch checks specific values, if-else can evaluate conditions")));

        questions.add(new Question(
                "What are collections in Java?",
                "a",
                List.of(
                        "a. Framework to store and manipulate groups of objects",
                        "b. Package for file handling",
                        "c. Library for networking",
                        "d. Class for exception handling")));

        questions.add(new Question(
                "What is ArrayList?",
                "b",
                List.of(
                        "a. Fixed-size array",
                        "b. Resizable array implementation of List",
                        "c. Implementation of Set",
                        "d. Thread class")));

        questions.add(new Question(
                "How to iterate using iterators?",
                "c",
                List.of(
                        "a. Using nextInt() method",
                        "b. Using for-each loop only",
                        "c. Using Iterator interface with hasNext() and next()",
                        "d. Using switch statement")));

        questions.add(new Question(
                "What is a Map?",
                "d",
                List.of(
                        "a. Collection of only values",
                        "b. Collection of only keys",
                        "c. List implementation",
                        "d. Collection of key-value pairs")));

        questions.add(new Question(
                "How to sort a list?",
                "a",
                List.of(
                        "a. Using Collections.sort()",
                        "b. Using Scanner.sort()",
                        "c. Using Iterator.sort()",
                        "d. Using List.shuffle()")));

        questions.add(new Question(
                "How to shuffle elements?",
                "b",
                List.of(
                        "a. Using Arrays.sort()",
                        "b. Using Collections.shuffle()",
                        "c. Using List.reverse()",
                        "d. Using Map.shuffle()")));

        Scanner sc = new Scanner(System.in);

        System.out.println("Ready For Quiz");
        System.out.println("Enter your Name : ");
        String name = sc.next();
        boolean flag = true;
        int score = 0;
        System.out.println("Welcome " + name + " !!");
        System.out.println("--------------------");
        Collections.shuffle(questions);
        while (flag) {
            System.out.println("Lets Start " + name);
            System.out.println("--------------------");
            for (Question question : questions) {
                System.out.println(question.getQuestion());
                for (String option : question.getOptions()) {
                    System.out.println(option);
                }
                System.out.print("Enter the valid option : ");
                String input = sc.next();
                if (input.equals(question.getAnswer())) {
                    score++;
                    System.out.println("WELLDONE !! Your answer is correct");
                } else {
                    System.out.println("Opps ! Correct answer is " + question.getAnswer());
                }

                System.out.println("--------------------");
            }

            System.out.println("Your total score is " + score);
            if (score == questions.size()) {
                System.out.println("Excellent !!");
            } else if (score == questions.size() - 1) {
                System.out.println("Good !!");
            } else if (score >= questions.size() - 2) {
                System.out.println("You did Well !!");
            } else {
                System.out.println("Better Luck Next Time");
            }
            System.out.println("Enter 1 to play Again or 2 to Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) {
                flag = false;
            } else {
                score = 0;
                Collections.shuffle(questions);
            }
        }

        System.out.println("Thanks for your time");

    }

}
