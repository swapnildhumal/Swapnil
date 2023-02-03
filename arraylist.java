package swapnil;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList<Integer>();
        m.add(15); m.add(25); m.add(35); m.add(45);
        System.out.println(m);
        System.out.println(m.isEmpty());
        m.remove(0);
        System.out.println(m);
    }
}
