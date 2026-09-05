class CurrentAccount extends BankAccount {

    double overdraft = 1000;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amt) {
        if (amt > balance + overdraft) {
            System.out.println("Error: Overdraft limit exceeded.");
        } else {
            balance = balance - amt;
        }
    }
}