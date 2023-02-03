package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code5 {
    public static void main(String[] args) throws IOException {
        int i, j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter value of i");
        i=Integer.parseInt(br.readLine());
        System.out.println("enter value of j");
        j=Integer.parseInt(br.readLine());
        System.out.println(i+j);
        System.out.println((i+j)/2);
    }
}
