package swapnil;

public class returnable_method {
    public static int swa(int a, int b){
        int c=a+b;
        return c;
    }
    public static boolean e(int a, int b) {
        int f=a%b;
        if (f==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int d=swa(5,3); boolean g = e(15, 3);
        System.out.println(d);
        System.out.println(g);


    }
}
