abstract class BankAccount {

    private String accNo;
    protected double balance;

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public abstract void withdraw(double amt);

    public double getBalance() {
        return balance;
    }
}