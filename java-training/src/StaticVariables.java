public class StaticVariables {
    static int i;
    int j;

    public static void main(String[] args) {
        StaticVariables staticVariables = new StaticVariables();
        StaticVariables staticVariables2 = new StaticVariables();
        staticVariables.i = 3;
        staticVariables.j = 4;
        staticVariables2.i = 5;
        staticVariables2.j = 6;

        System.out.println(staticVariables.i +""+ staticVariables.j +""+ staticVariables2.i +""+ staticVariables2.j);
    }
}
