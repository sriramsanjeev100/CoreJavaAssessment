package MethodReference;

interface Square
{
    int calculate(int n);
}

class FindingSquare
{
    public static int square(int n)
    {
        return n*n;
    }
}
public class SquareOfNumber
{
    public static void main(String[] args)
    {
        Square s = FindingSquare::square;
        int result = s.calculate(5);
        System.out.println("Result : "+result);
    }
}
