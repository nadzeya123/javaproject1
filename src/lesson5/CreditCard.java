package lesson5;

public class CreditCard
{
    int accountNumber;
    int currentAmount;

    CreditCard(int accountNumber, int currentAmount)
    {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;

    }

    void addMoney (int addedAmount)
    {
        int finalAmount1 = currentAmount + addedAmount;
        System.out.println("The amount on your card is " + finalAmount1 + ".");
    }

    void withdrawMoney (int withdrawnAmount)
    {
        int finalAmount2 = currentAmount - withdrawnAmount;
        System.out.println("The amount on your card is " + finalAmount2 + ".");
    }

}
