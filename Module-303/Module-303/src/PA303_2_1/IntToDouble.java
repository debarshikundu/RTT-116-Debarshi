package PA303_2_1;

public class IntToDouble {
    public static void main(String[] args)
    {
        int x = 5;
        int y = 6;

        double q = y/x;

        System.out.println("Integer Division: " + q);

        q = (double) y/x;

        System.out.println("Cast To Double: " + q);
    }
}
