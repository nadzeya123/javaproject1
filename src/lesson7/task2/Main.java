package lesson7.task2;

public class Main
{
    public static void main(String[] args)
    {
        Printable director = new Director("John", "director");
        Printable worker = new Worker("Andrew", "worker");
        Printable accountant = new Accountant("Kate", "accountant");

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
