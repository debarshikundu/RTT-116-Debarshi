package PA303_2_1;

public class IntDiv {
    public static void main(String[] args)
    {
        int x =12;
        int y = 5;

        int quotient1 = x/y;

        System.out.println("Integer Division: " + quotient1);

        double quotient2 = (double) x/y;
        System.out.println("Cast To Double: " + quotient2);
    }
}
