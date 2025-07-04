

public class InsufficientBalanceException extends RuntimeException {


    public InsufficientBalanceException(double balance, double required) {


        super("Insufficient balance. Current: " + balance + ", Required: " + required);
    }
}