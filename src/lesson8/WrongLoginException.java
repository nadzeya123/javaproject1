package lesson8;

public class WrongLoginException extends RuntimeException
{
    public WrongLoginException()
    {
    }
    public WrongLoginException(String message)
    {
        super(message);
    }
}
