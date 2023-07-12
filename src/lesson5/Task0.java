package lesson5;

public class Task0
{
    public static void main(String[] args)
    {
        CreditCard card1 = new CreditCard (1234, 200);
        CreditCard card2 = new CreditCard(6789, 100);
        CreditCard card3 = new CreditCard(4535, 50);

        card1.addMoney(200);
        card2.addMoney(100);
        card3.withdrawMoney(150);
    }
}
