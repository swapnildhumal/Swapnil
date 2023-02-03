package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methods {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        add(num1, num2);
        sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);

    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void mul(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public static void div(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
