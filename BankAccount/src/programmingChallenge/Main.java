package programmingChallenge;

public class Main {

    public static void main(String[] args) {
        /*  PROGRAM INSTRUCTION
        * Create a new class for a bank account
        * Create fields for the account number, balance, customer name, email, phone number
        *
        * create a getters and setters for the field
        * Create  two methods
        *  1. To allow the customer to deposit funds (this should increment the balance field)
        *  2. To allow the customer to withdraw funds (this should deduct from balance field)
        *  but not allow the withdrawal to complete if their balance are insufficient funds
        *  you will want to create various code in the main Class to confirm your code is working.
        *  Add some System.out.println's in the two methods above as well
        * */

       /*
        Account takiAccount = new Account();
        takiAccount.setNumber("12345");
        takiAccount.setBalance(0);
        takiAccount.setCustomerName("Avhatakali");
        takiAccount.setCustomerEmailAddress("taki@gmail.com");
        takiAccount.setCustomerName("(087) 123-4567");
        */

       //instance of a class
       Account takiAccount = new Account("12345", 0.00, "Avhatakali", "taki@gmail.com", "(087) 123-4567");
        System.out.println(takiAccount.getNumber());
        System.out.println(takiAccount.getBalance());
        System.out.println(takiAccount.getCustomerName());
        System.out.println(takiAccount.getCustomerEmailAddress());
        System.out.println(takiAccount.getCustomerPhoneNumber());


/*
        takiAccount.withdrawal(100.0);

        takiAccount.deposit(50.0);
        takiAccount.withdrawal(100.0);

        takiAccount.deposit(51.0);
        takiAccount.withdrawal(100.0);

*/
    }
}
