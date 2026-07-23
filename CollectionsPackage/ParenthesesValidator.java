package CollectionsPackage;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesValidator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Java Code : ");
        String code = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for (char ch : code.toCharArray())
        {
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (stack.isEmpty())
                {
                    valid = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
                {
                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty())
        {
            valid = false;
        }
        if (valid)
        {
            System.out.println("Parentheses are Balanced.");
        }
        else
        {
            System.out.println("Invalid Parentheses.");
        }

        sc.close();
    }
}