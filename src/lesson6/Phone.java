package lesson6;

import java.util.Arrays;

public class Phone
{
    private int number;
    private String model;
    private float weight;

    public Phone()
    {
    }

    public Phone(int number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, float weight)
    {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall (String callerName)
    {
        System.out.println(callerName + " is calling");
    }

    public void receiveCall (String callerName, int callerPhoneNumber)
    {
        System.out.println(callerName + " is calling from phone number " + callerPhoneNumber);
    }

    public int getNumber()
    {
        return number;
    }

    public void sendMessage(int... phoneNumber)
        {
            for (int i = 0; i < phoneNumber.length; i++)
            {

            }

            System.out.println(Arrays.toString(phoneNumber));
        }

    @Override
    public String toString()
    {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void showData()
    {
        System.out.println(this.toString());
    }
}


