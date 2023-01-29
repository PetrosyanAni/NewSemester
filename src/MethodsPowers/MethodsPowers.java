package MethodsPowers;

public class MethodsPowers {
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 4));
    }

    public static int calculatePower(int a, int b) {
        if (a < 0) {
            System.out.println("Wrong input: Negative number");
            return (-2);
        } else if ((a < -10 || a > 10) || (b < -10 || b > 10)) {
            System.out.println("Input is out of range");
            return (-1);
        } else {
            int f = a;
            for (int i = 0; i < b - 1; i++) {
                f *= a;
            }
            return (f);
        }
    }
}
