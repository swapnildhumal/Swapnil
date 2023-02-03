package swapnil;

import java.util.ArrayList;

public class arraylist_string {
    public static void main(String[] args) {
        ArrayList<String> i=new ArrayList<String>();
        i.add("swapnil");i.add("suraj");i.add("akshay");
        System.out.println(i);
        i.remove(0);
        System.out.println(i);
        ArrayList<String> j=new ArrayList<String>();
        j.add("swapnil");j.add("suraj");j.add("akshay");
        System.out.println(j);
        j.remove(0);
        System.out.println(j);
        j.removeAll(j);
        System.out.println(j);
        j.clear();
        System.out.println(j);

    }
}
