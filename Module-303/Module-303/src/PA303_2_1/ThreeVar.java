package PA303_2_1;

public class ThreeVar {
    public static void main(String[] args)
    {
        double coffee = 2.64;

        double greenTea = 4.21;

        double muffin = 3.00;

        final double SALES_TAX = .08;

        double subTotal = 3*coffee + 4*greenTea + 2*muffin;

        double total = subTotal + subTotal*SALES_TAX;

        System.out.printf("%.2f", total);

    }
}
