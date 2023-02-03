package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class overloading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        add(10,5,2);



    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2);
    }

    public static void sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void sub(int num1, int num2, int num3) {
        System.out.println(num1 - num2 - num3);
    }

    public static void mul(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void mul(int num1, int num2, int num3) {
        System.out.println(num1 * num2 * num3);
    }
    public static void div(int num1, int num2) {
        System.out.println(num1 / num2);
    }
    public static void div(int num1, int num2, int num3) {
        System.out.println(num1 / num2 / num3);
    }

}