package DesignPatterns.Builder.BankTransaction;

public final class Transaction
{
    private final String customerName;
    private final String transactionType;
    private final double amount;
    private final String remarks;
    private final String beneficiaryAccount;
    private final String branchCode;
    private final String referenceNumber;

    private Transaction(Builder builder)
    {
        this.customerName = builder.customerName;
        this.transactionType = builder.transactionType;
        this.amount = builder.amount;
        this.remarks = builder.remarks;
        this.beneficiaryAccount = builder.beneficiaryAccount;
        this.branchCode = builder.branchCode;
        this.referenceNumber = builder.referenceNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getTransactionType()
    {
        return transactionType;
    }

    public double getAmount()
    {
        return amount;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public String getBeneficiaryAccount()
    {
        return beneficiaryAccount;
    }

    public String getBranchCode()
    {
        return branchCode;
    }

    public String getReferenceNumber()
    {
        return referenceNumber;
    }

    @Override
    public String toString()
    {
        return "Customer Name : " + customerName +
                "\nTransaction Type : " + transactionType +
                "\nAmount : Rs." + amount +
                "\nRemarks : " + remarks +
                "\nBeneficiary Account : " + beneficiaryAccount +
                "\nBranch Code : " + branchCode +
                "\nReference Number : " + referenceNumber;
    }

    public static class Builder
    {
        private String customerName;
        private String transactionType;
        private double amount;
        private String remarks;
        private String beneficiaryAccount;
        private String branchCode;
        private String referenceNumber;

        public Builder(String customerName, String transactionType, double amount)
        {
            this.customerName = customerName;
            this.transactionType = transactionType;
            this.amount = amount;
        }

        public Builder remarks(String remarks)
        {
            this.remarks = remarks;
            return this;
        }

        public Builder beneficiaryAccount(String beneficiaryAccount)
        {
            this.beneficiaryAccount = beneficiaryAccount;
            return this;
        }

        public Builder branchCode(String branchCode)
        {
            this.branchCode = branchCode;
            return this;
        }

        public Builder referenceNumber(String referenceNumber)
        {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Transaction build()
        {
            return new Transaction(this);
        }
    }
}