package outs;

public class test2 {
    public static void main(String[] args) {
        int I0, I1, II;
        int IO, I10 = 11, I11 = 16;
        I0 = 100;
        I1 = 20;
        if (I0 >= 10) {
            II = I0 + 40;
        } else {
            II = I1 * 22;
            while (I0 < 120) {
                I0 = I0 + 9;
                if (I0 > 115) {
                    I1 = I1 + 2;
                }
            }
        }

        IO = I10 + 3;
        I10 = I11 + 13;
        I11 = IO + 3;
        System.out.println(I0);
        System.out.println(II);

        IO = I10 * I11 - IO;
        I10 = I11 * IO - I10;
        I11 = IO * I10 - I11;
    }
}
