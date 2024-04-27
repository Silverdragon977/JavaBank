
public class account {
    private String fullName;
    private String birthDate;
    private String username;
    private String password;
    private double amountInCheckingAccount;
    private double amountInSavingAccount;
    private boolean isloggedIn;

    // constructor
    public account(String fullName, String birthDate,String username, String password){
        this.fullName=fullName;
        this.birthDate=birthDate;
        this.username=username;
        this.password=password;
        this.amountInCheckingAccount=0;
        this.amountInSavingAccount=0;
        this.isloggedIn = false;
    }
    
    // Getters
    public String getFullName() {if (isloggedIn == true){return fullName;}else {return "Not logged in!";}}
    public String getBirthDate(){if (isloggedIn == true){return birthDate;}else {return "Not logged in!";}}
    public double getAmountInCheckingAccount(){
        if (isloggedIn == true){
            return amountInCheckingAccount;
        }else {System.out.println("Not logged in!");return -1;}}
    public double getAmountInSavingAccount(){
        if (isloggedIn == true){
            return amountInSavingAccount;
        }else {System.out.println("Not logged in!");return -1;}}
 
    // Setters
    public void setFullName(String newName){
        if (isloggedIn==true){
            this.fullName = newName;
        }else{System.out.println("Not logged in!");}}
    public void setBirthDate(String newBirthDate){
        if (isloggedIn==true){
            this.birthDate=newBirthDate;
        }else{System.out.println("Not logged in!");}}
    public void addAmountInCheckingAccount(double deposit){
        if (isloggedIn==true){
            this.amountInCheckingAccount += deposit;
        }else{System.out.println("Not logged in!");}}
    public void addAmountInSavingAccount(double deposit){
        if (isloggedIn==true){
            this.amountInSavingAccount += deposit;
        }else{System.out.println("Not logged in!");}}
    public void rmAmountInCheckingAccount(double withdraw){
        if (isloggedIn==true){
            this.amountInCheckingAccount -= withdraw;
        }else{System.out.println("Not logged in!");}}
    public void rmAmountInSavingAccount(double withdraw){
        if (isloggedIn==true){ 
        this.amountInSavingAccount -= withdraw;
        }else{System.out.println("Not logged in!");}}
    
    // Display account information
    public Object[] getAccountDetails(){
        if (isloggedIn == true){
            // returns an array of info
            return new Object[]{fullName, birthDate,username, amountInCheckingAccount, amountInCheckingAccount};
        } else {return new Object[]{"Please Sign in first!"};}
    }
    // Print out account information
    public void printAccountDetails() {
        if (isloggedIn == true){
            // Prints out the info to the console
            System.out.println("Account details:");
            System.out.println("Full Name: " + fullName);
            System.out.println("Username: " + username);
            System.out.println("Birth Date: " + birthDate);
            System.out.println("\nAccount Balances:");
            System.out.println("Checking Account Balance: " + amountInCheckingAccount);
            System.out.println("Saving Account Balance: " + amountInSavingAccount);
        } else {System.out.println("Please Sign in first!");}

    }
    
    // login method
    public void login (String checkBirthDate,String username, String password){
        if (checkBirthDate == this.birthDate && username == this.username && password == this.password){
            isloggedIn = true;
        }else{System.out.println("Login unsuccessfully!");} 
    }


}// End of Account class
