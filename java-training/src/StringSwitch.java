public class StringSwitch {
    public static void main(String[] args) {
        String result = "true";

        switch (result) {
            case "true":
                System.out.print("True");
                break;

            default:
                System.out.println("****");
        }
        System.out.println("Done");
    }
}
