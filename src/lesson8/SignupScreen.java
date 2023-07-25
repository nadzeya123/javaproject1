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
            if (login.length() < 20 && login.contains(" ") == false)
            {
                System.out.println("Login is correct.");
                return;
            }

            WrongLoginException exception1 = new WrongLoginException();
            throw exception1;
        }
        catch (WrongLoginException exception1)
        {
            System.out.println("Login error! Login must be less than 20 characters long without spaces.");
        }
    }

    public void setPassword(String password)
    {
        this.password = password;

        try
        {
            if (password.length() < 20 && password.contains(" ") == false)
            {
                System.out.println("Password is correct.");
                return;
            }

            WrongPasswordException exception2 = new WrongPasswordException();
            throw exception2;

        }
        catch (WrongPasswordException exception2)
        {
            System.out.println("Password error! Password must be less than 20 characters long without spaces.");
        }
    }

    public void setConfirmPassword(String confirmPassword)
    {
        this.confirmPassword = confirmPassword;

        try
        {
            if (password == confirmPassword)
            {
                System.out.println("Password is confirmed.");
                return;
            }

            WrongPasswordException exception3 = new WrongPasswordException();
            throw exception3;
        }
        catch (WrongPasswordException exception3)
        {
            System.out.println("Confirm password error! Password and confirm password do not match.");
        }
    }
}
