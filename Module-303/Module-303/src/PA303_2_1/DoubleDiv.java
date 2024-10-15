package PA303_2_1;

public class DoubleDiv {
    public static void main(String[] args)
    {
        double x = 7.0;
        double y = 5.0;
        double quotient1 = x/y;

        System.out.println("Double Quotient: "+ quotient1);

        int quotient2 = (int) quotient1;

        System.out.println("Casted to Int: "+ quotient2);
    }
}
