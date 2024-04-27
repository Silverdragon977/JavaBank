public class App {
    public static void main(String[] args) throws Exception {
        // Main()
        account Person1 = new account("Michael", "09/07/96","silverdragon977", "password123");
        Person1.printAccountDetails();
        Person1.login("09/07/96", "silverdragon977", "password123");
        Person1.printAccountDetails();



    }
}
