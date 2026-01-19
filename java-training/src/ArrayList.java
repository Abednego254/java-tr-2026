import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if(names.remove("Bran")) {
            names.add("Jon");
        }
        names.remove("Bran");
        System.out.println(names);
    }
}
