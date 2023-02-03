package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code8 {
    public static void main(String[] args) throws IOException {
        int p = 35, c = 40, m = 40;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter value of p");
        p = Integer.parseInt(br.readLine());
        System.out.println("enter value of c");
        c = Integer.parseInt(br.readLine());
        System.out.println("enter value of m");
        m = Integer.parseInt(br.readLine());
        int avg = (p + c + m)/3;
        if (p > 35 && c > 35 && m > 35 && avg > 40)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
