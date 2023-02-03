package swapnil;
class dhumal{
    public static void add(int x, int y) {
        System.out.println(x+y);

    }
}
public class calculator1 {


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {

        System.out.println(a / b);
    }

    public static void main(String[] args) {
        calculator1 abc=new calculator1();
        abc.add(20, 10);
        abc.sub(20, 10);
        abc.mul(20, 10);
        abc.div(20, 10);
        dhumal a= new dhumal();
        a.add(10,5);
    }


}
