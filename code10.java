package swapnil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code10 {
    public static void main(String[] args) throws IOException {
        int w;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter digit");
        w=Integer.parseInt(br.readLine());
        switch (w){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid digit");

        }
    }
}
