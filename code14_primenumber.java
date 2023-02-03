package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code14_primenumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your number");
        int num=Integer.parseInt(br.readLine());
        for(int i=2;i<=num/2;i++){
            if ((num%i==0)){
                System.out.println("not a prime");
            }else {
                System.out.println("prime number");
            }

        }

            }

}
