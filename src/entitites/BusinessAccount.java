package entitites;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){
        if (amount <= loanLimit){
            // só é possivel pq balnce é protected
            balance += amount - 10; // taxa de 10 dinheiros para sacar
        }

    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
