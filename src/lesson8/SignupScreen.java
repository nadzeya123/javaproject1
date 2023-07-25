package lesson8;

public class SignupScreen
{
    private String login;
    private String password;
    private String confirmPassword;

    public void setLogin(String login)
    {
        this.login = login;

        try
        {
            if (login.length() < 20 && !login.contains(" "))
            {
                System.out.println("Login is correct.");
                return;
            }

            WrongLoginException exception = new WrongLoginException();
            throw exception;
        }
        catch (WrongLoginException exception)
        {
            System.out.println("Login error! Login must be less than 20 characters long without spaces.");
        }
    }

    public void setPassword(String password)
    {
        this.password = password;

        try
        {
            if (password.length() < 20 && !password.contains(" "))
            {
                System.out.println("Password is correct.");
                return;
            }

            WrongPasswordException exception = new WrongPasswordException();
            throw exception;

        }
        catch (WrongPasswordException exception)
        {
            System.out.println("Password error! Password must be less than 20 characters long without spaces.");
        }
    }

    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword = confirmPassword;

        try
        {
            if (password.equals(confirmPassword))
            {
                System.out.println("Password is confirmed.");
                return;
            }

            WrongPasswordException exception = new WrongPasswordException();
            throw exception;
        }
        catch (WrongPasswordException exception)
        {
            System.out.println("Confirm password error! Password and confirm password do not match.");
        }
    }
}
