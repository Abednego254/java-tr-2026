import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j != 0) {
                System.out.print(number+ " is a prime number");
                break;
            }else {
                System.out.print(number+ " is not a prime number");
                break;
            }
        }
    }
}
