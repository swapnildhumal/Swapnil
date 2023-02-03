package swapnil;

public class non_returnable_method {
    public static void main(String[] args) {
        add(20, 10);
        sub(20, 10);
        mul(20, 10);
        div(20, 10);

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
    public static void mul(int a, int b){
        System.out.println(a*b);
        }
    public static void div(int a, int b) {
        System.out.println(a / b);
    }


}
