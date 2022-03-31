package outs;
public class test0 {
public static void main(String[] args) {
int I0;
int I1, II = 1, IO = 15;
I0 = 10;

I1 = II + 5;
System.out.println(I0);

I1 = II * IO - I1;
II = IO * I1 - II;
IO = I1 * II - IO;
}
}
