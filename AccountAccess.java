public class AccountAccess{
    public static void main(String[] args){

        BankAccount bankaccount = new BankAccount();

        // update using setter menthods
        bankaccount.setAccountNumber("26550500001234");
        bankaccount.setBalance(12345.67);

        // access data using getter method
        String accountNumber = bankaccount.getAccountNumber();
        double balance = bankaccount.getBalance();

        System.out.println("Account number is: " + accountNumber);
        System.out.println("Balance is: " + balance);
    }
}