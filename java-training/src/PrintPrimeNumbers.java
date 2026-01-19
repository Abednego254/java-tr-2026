public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int lowerBound = 1, upperBound = 100;
        System.out.println("The prime numbers between " + lowerBound + " and " + upperBound + " are: ");

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i <= 1) {
                continue;
            }

            boolean isPrime = true;
            for (int j =2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}