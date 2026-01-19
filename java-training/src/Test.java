public class Test {
    void readCard(int cardNo) throws RuntimeException{ //Must return a runtime exception if there is no exception in main()
        System.out.println("Reading Card");
    }
    void checkingCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args)  { //If throws Exception, can ommit error at line 13
        Test ex = new Test();
        int cardNo = 12344;
        ex.checkingCard(cardNo);
        ex.readCard(cardNo);
    }
}
