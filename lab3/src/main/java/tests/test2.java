package tests;

public class test2 {
    public static void main(String[] args) {
        int x, y, z;
        x = 100;
        y = 20;
        if (x >= 10) {
            z = x + 40;
        } else {
            z = y * 22;
            while (x < 120) {
                x = x + 9;
                if (x > 115) {
                    y = y + 2;
                }
            }
        }
        System.out.println(x);
        System.out.println(z);
    }
}