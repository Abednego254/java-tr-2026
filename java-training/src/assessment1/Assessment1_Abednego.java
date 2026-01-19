package assessment1;
/**  ASSESSMENT ONE: Basic logic and Syntax
 * NAME: Abednego Kaume
 * Java SE
 */

import java.util.Scanner;

public class Assessment1_Abednego {

    // method for executing the program. Trainer Helper
    public static boolean confirmExecution(Scanner scanner, String quizTitle) {
        System.out.println("\n====================================");
        System.out.println(quizTitle);
        System.out.println("Type YES to execute this program (or any other word to skip) : ");
        System.out.println("===================================");
        String response = scanner.nextLine().trim();
        return response.equalsIgnoreCase("YES");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        if (confirmExecution(scanner, "Quiz Problem 1: Variable operations")) {
                /*  ======================================
                    QUIZ PROBLEM 1: Variable Operations
                    ======================================
                 */

            int a = 15, b = 4, c = 7; // Variable Declaration of the three integer variables

            // Calculating and printing the sum of all the 3 numbers
            int sum = a + b + c;
            System.out.println("Sum: " + sum);

            // Calculating and printing the product of a and b
            int product = a * b;
            System.out.println("Product: " + product);

            // Calculating and printing the result of the expression
            int expressionResult = (a + b) * c;
            System.out.println("Expression Result: " + expressionResult);

            //Calculating and printing the remainder when a and b are divided
            int remainder = a % b;
            System.out.println("Remainder: " + remainder);
        }

        if (confirmExecution(scanner, "Quiz Problem 2: Grade Calculator")) {
                /* ======================================
                    QUIZ PROBLEM 2: Grade Calculator
                    =====================================
                 */

            // Taking the student's score from the user
            System.out.print("Enter student score: ");

            // Storing the input in a variable called score
            int score = scanner.nextInt();
            scanner.nextLine();

            // Using if to make decisions on what grade the student has attained, after which, the grade is printed
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score < 90) {
                System.out.println("B");
            } else if (score >= 70 && score < 80) {
                System.out.println("C");
            } else if (score >= 60 && score < 70) {
                System.out.println("D");
            } else if (score >= 0 && score < 60) {
                System.out.println("F");
            } else {
                System.out.println("Error: Score must be between 0 and 100");
            }
        }

        if (confirmExecution(scanner, "Quiz Problem 3: Number Sequence")) {
            /*  ==================================
                QUIZ PROBLEM 3: Number Sequence
                ===================================
             */

            //Setting the upper and lower bounds of the program
            int lowerBound = 1, upperBound = 20;

            // For loop to iterate through the numbers 1 to 20
            for (int number = lowerBound; number <= upperBound; number++) {

                String type;
                // IF statement to check if a number is even or odd
                if (number % 2 == 0) {
                    type = "Even";
                } else {
                    type = "Odd";
                }

                // Print base information
                System.out.println(number +" - "+ type);

                //IF statement to check if the number is a multiple of 5
                if (number % 5 == 0) {
                    System.out.println(number + " - "+type +", Multiple of five");
                }

            }
        }

        if (confirmExecution(scanner, "Quiz Problem 4: Input Validation")) {

            /*  ===================================
                QUIZ PROBLEM 4: Input Validation
                ===================================
             */

            int num;
            while (true) {
                // Getting the positive integer from the user ad storing it in a variable called num
                System.out.println("Enter a positive integer: ");
                num = scanner.nextInt(); //Keep asking for the integer from the user
                scanner.nextLine();

                if (num > 0) {
                    break;  // If the integer is greater than o, exit the loop
                } else {
                    System.out.println("Error: Number must be positive"); // Input Validation done here
                }
            }

            // Calculate the factorial of the positive integer
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        if (confirmExecution(scanner, "Quiz Problem 5: Pattern Printing")) {
            /*  =======================================
                QUIZ PROBLEM 5: Pattern Printing
                =======================================
             */

            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
        System.out.println("All questions assessed. End of assessment. Thank yesyou for assessment.");

    }
}