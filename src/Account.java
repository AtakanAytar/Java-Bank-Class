public class Account {
    private int accountNo;
    private int moneyAmount;

    public Account(int accountNo, int moneyAmount) {
        this.accountNo = accountNo;
        this.moneyAmount = moneyAmount;
    }

    public void withdraw(int amount){
        this.moneyAmount -= amount;
        System.out.println("Withdrawn: " + amount + " New amount: " + this.moneyAmount);

    }

    public void deposit(int amount){
        this.moneyAmount += amount;
        System.out.println("Deposited: " + amount + " New amount: " + this.moneyAmount);


    }
}
