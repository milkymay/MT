package outs;
public class test1 {
public static void main(String[] args) {
int I0,I1;
int II, IO = 6, I10 = 13;
I0 = 10;
I1 = 20;
if (I0 > 10) {
I0 = I0 + 20;
}

II = IO + 13;
IO = I10 + 4;
System.out.println(I0);
System.out.println(I1);

II = IO * I10 - II;
IO = I10 * II - IO;
I10 = II * IO - I10;
}
}
