package lesson6;

public class Task1
{
    public static void main(String[] args)
    {
        Phone phone1 = new Phone(1234, "iPhone 12", 250f);
        Phone phone2 = new Phone (5678, "Samsung Galaxy S23", 280f);
        Phone phone3 = new Phone (3476, "iPhone 14 Pro Max", 320f);

        phone1.showData();
        phone2.showData();
        phone3.showData();

        phone1.receiveCall("Dad");
        phone2.receiveCall("Mum");
        phone3.receiveCall("Hubby");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("Sister", 4567);

        phone2.sendMessage(+3456, +4321, +5678);
    }
}
