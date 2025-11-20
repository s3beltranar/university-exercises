public class Account {

    // * Attributes.
    private double balance;
    private String holder_name;

    // * Construct.
    public Account(double account_balance, String holder_name) {
        this.balance = account_balance;
        this.holder_name = holder_name;
    }

    // * Getters.
    public double getBalance() {
        return balance;
    }
    public String getHolder_Name() {
        return holder_name;
    }

    // * Setters.
    public void setBalance(double account_balance) {
        this.balance = account_balance;
    }
    public void setHolder_Name(String holder_name) {
        this.holder_name = holder_name;
    }

    // * Methods to deposit funds and withdraw funds.
    public void Deposit_Funds(double funds) {
        balance += funds;
    }
    public void Withdraw_Funds(double funds) {
        // * We validate if there is enough balance.
        if (funds <= balance) {
            balance -= funds;
        } else {
            System.out.println("ERROR. Not enough balance.");
        }
    }
}