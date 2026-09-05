class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Error: Insufficient Funds. Savings cannot go below 0.");
        } else {
            balance = balance - amt;
        }
    }
}