package tests;

public class test3 {
    public static void main(String[] args) {
        int x, y, z;
        int a, b;
        int c;
        a = 1;
        b = 22;
        x = b - a;
        y = a * b;
        c = x + y;
        z = a;
        if (c < 66) {
            z = 2222 - x;
            if (z < x) {
                c = 55 - x;
                z = a + b;
            } else {
                c = 55 - y;
                z = a + c;
            }
        } else {
            c = 37 * y;
        }
        System.out.println(z);
        System.out.println(c);
        System.out.println(a);
    }
}