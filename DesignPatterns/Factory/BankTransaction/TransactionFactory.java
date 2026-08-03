package DesignPatterns.Factory.BankTransaction;

public class TransactionFactory
{
    public static Transaction createTransaction(String type, double amount)
    {
        switch (type)
        {
            case "Deposit":
                return new DepositTransaction(amount);

            case "Withdraw":
                return new WithdrawTransaction(amount);

            case "Transfer":
                return new TransferTransaction(amount);

            default:
                throw new IllegalArgumentException("Invalid Transaction");
        }
    }
}