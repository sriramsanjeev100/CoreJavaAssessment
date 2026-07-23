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
            switch (ch)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;

                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty())
                    {
                        valid = false;
                        break;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
                    {
                        valid = false;
                    }
                    break;

                default:
                    break;
            }

            if (!valid)
            {
                break;
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