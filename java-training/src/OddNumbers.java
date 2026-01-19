public class OddNumbers {
    public static void main(String[] args) {
        int lowerBound = 1, upperBound = 1000;
        System.out.println("The odd numbers between "+lowerBound+" and "+upperBound+"are: ");

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ ",");
            }
        }
    }
}
