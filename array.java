package swapnil;

public class array {
    public static void main(String[] args) {
        int sum=0;
        int[] a=new int[5];
        a[0]=10;a[1]=12;a[2]=15;a[3]=20;a[4]=25;
        System.out.println(a.length);
        for (int i=0; i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }


}
