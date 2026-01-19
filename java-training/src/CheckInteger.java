import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }  else {
            System.out.println("Odd");
        }
//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        }
    }

    public void findMultiples(int number) {

    }
}
