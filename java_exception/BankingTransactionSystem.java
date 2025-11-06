import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) { super(msg); }
}
class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) { super(msg); }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) { super(msg); }
}

class Transaction {
    public void processTransaction(int amount, int balance) throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random rand = new Random();
        int issue = rand.nextInt(3);
        if (amount < 0) throw new NegativeAmountException("Amount cannot be negative!");
        else if (amount > balance) throw new InsufficientFundsException2("Not enough balance!");
        else if (issue == 2) throw new NetworkFailureException("Network error occurred!");
        else System.out.println("Transaction successful!");
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.processTransaction(12000, 10000);
        } catch (NegativeAmountException | InsufficientFundsException2 | NetworkFailureException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}