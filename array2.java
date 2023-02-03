package swapnil;

public class array2 {
    public static void main(String[] args) {
        int mul=1;
        int[]  a={1,2,3,4,5};
        System.out.println(a.length);
        for (int i=0; i<a.length;i++){
            mul=mul*a[i];
        }
        System.out.println(mul);
    }
}
