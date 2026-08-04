package DesignPatterns.Builder.BankTransaction;

public class BankMain
{
    public static void main(String[] args)
    {
        Transaction transaction1 = new Transaction.Builder("Sriram", "Transfer", 25000)
                        .beneficiaryAccount("10244372015")
                        .branchCode("SBIN03355")
                        .referenceNumber("REF1001")
                        .remarks("House Rent")
                        .build();

        Transaction transaction2 = new Transaction.Builder("Leo", "Deposit", 5000)
                        .remarks("Cash Deposit")
                        .build();

        System.out.println("===== Transaction 1 =====");
        System.out.println(transaction1);

        System.out.println();

        System.out.println("===== Transaction 2 =====");
        System.out.println(transaction2);
    }
}