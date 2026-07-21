package StringQuestions;

import java.util.Scanner;

public class UserValidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean validUsername = true;
        boolean validEmail = true;
        boolean validPassword = true;

        if (username.length() < 5 || username.length() > 20)
        {
            validUsername = false;
        }
        else if (!Character.isLetter(username.charAt(0)))
        {
            validUsername = false;
        }
        else if (username.contains(" "))
        {
            validUsername = false;
        }

        if (email.contains("@"))
        {
            System.out.println("Email is Valid");
        } else
        {
            System.out.println("Email is Invalid");
        }

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        if (password.length() >= 8)
        {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch))
                    upper = true;
                else if (Character.isLowerCase(ch))
                    lower = true;
                else if (Character.isDigit(ch))
                    digit = true;
                else
                    special = true;
            }
        }

        sc.close();
    }
}
